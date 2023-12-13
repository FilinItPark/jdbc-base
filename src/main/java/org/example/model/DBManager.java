package org.example.model;

import org.example.model.db.DBConnection;
import org.example.model.repository.CountryRepository;
import org.example.model.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;


/**
 * @author 1ommy
 * @version 13.12.2023
 */
public class DBManager {
    private Logger logger = LoggerFactory.getLogger(DBManager.class);
    private final CountryRepository countryRepository;
    private final UserRepository userRepository;

    private DBManager() {
        logger.info("DBManager created");

        Connection connection = DBConnection.getInstance().getConnection();

        countryRepository = new CountryRepository(connection);
        userRepository = new UserRepository(connection);
    }

    public CountryRepository getCountryRepository() {
        return countryRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    private static DBManager instance = null;

    public static DBManager getInstance() {
        if (instance == null) {
            instance = new DBManager();
        }

        return instance;
    }
}
