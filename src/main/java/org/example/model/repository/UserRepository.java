package org.example.model.repository;

import org.example.model.entity.Country;
import org.example.model.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 1ommy
 * @version 13.12.2023
 */
public class UserRepository {
    private Connection connection;
    private Logger logger = LoggerFactory.getLogger(UserRepository.class);

    public UserRepository(Connection connection) {
        this.connection = connection;
    }

    public List<User> findAll() throws SQLException {
        List<User> users = new ArrayList<>();

        Statement statement = connection.createStatement();
        String sql = "select * from users";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String fullName = resultSet.getString("fullName");
            int countryId = resultSet.getInt("country_id");

            var user = new User(id, username, fullName, countryId);
            users.add(user);
        }

        logger.debug("Мы успешно нашли все записи");

        resultSet.close();
        statement.close();

        return users;
    }
}
