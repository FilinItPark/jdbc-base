package org.example.model.entity;

/**
 * @author 1ommy
 * @version 13.12.2023
 */
public class Country {
    private int id;
    private String title;
    private Integer population;

    public Country(int id, String title, Integer population) {
        this.id = id;
        this.title = title;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", population=" + population +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}
