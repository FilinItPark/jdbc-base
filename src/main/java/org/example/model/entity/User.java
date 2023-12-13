package org.example.model.entity;

/**
 * @author 1ommy
 * @version 13.12.2023
 */
public class User {
    private int id;
    private String username;
    private String fullName;
    private Integer countryId;
    private Country country;

    public User(int id, String username, String fullName, Integer countryId) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.countryId = countryId;
        this.country = null;
    }

    public User(String username, String fullName, Integer countryId) {
        this.username = username;
        this.fullName = fullName;
        this.countryId = countryId;
        this.country = null;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", countryId=" + countryId +
                ", country=" + country +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
