package org.example.model.repository;

import org.example.model.entity.Country;

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
public class CountryRepository {
    private Connection connection;

    public CountryRepository(Connection connection) {
        this.connection = connection;
    }

    public List<Country> findAll() throws SQLException {
        List<Country> countries = new ArrayList<>();

        Statement statement = connection.createStatement();
        String sql = "select * from country";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String title = resultSet.getString("title");
            int population = resultSet.getInt("population");

            var country = new Country(id, title, population);
            countries.add(country);
        }

        resultSet.close();
        statement.close();

        return countries;
    }
}
