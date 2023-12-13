package org.example;

import org.example.model.DBManager;
import org.example.model.entity.Country;
import org.example.model.repository.CountryRepository;
import org.example.model.repository.UserRepository;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 1ommy
 * @version 13.12.2023
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        // jdbc - java database connectivity driver
        CountryRepository countryRepository = DBManager.getInstance().getCountryRepository();
        List<Country> all = countryRepository.findAll();

        for (Country country : all) {
            System.out.println(country);
        }

        UserRepository userRepository = DBManager.getInstance().getUserRepository();

        var users = userRepository.findAll();

        users.forEach(System.out::println);
    }
}