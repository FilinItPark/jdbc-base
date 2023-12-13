package org.example.model.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 1ommy
 * @version 13.12.2023
 */
public class DBConnection {
    private Connection connection;
    private Logger logger = LoggerFactory.getLogger(DBConnection.class);

    public Connection getConnection() {
        return connection;
    }

    private DBConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://83.147.246.87:5432/demo_db_vanya",
                    "demo_db_vanya_user", "12345");
        } catch (SQLException exception) {
            logger.error("Произошла ошибка при попытке подключиться к базе данных", exception);
        }
    }

    private static DBConnection instance = null;

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }

        return instance;
    }


}
