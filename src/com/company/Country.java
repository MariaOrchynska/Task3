package com.company;

import java.io.File;

public class Country {

     String Name;
     String Continent;

    public Country(String name, String continent, String indepYear, String capital, String population) {
        Name = name;
        Continent = continent;
        IndepYear = indepYear;
        Capital = capital;
        Population = population;
    }

     String IndepYear;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(String indepYear) {
        IndepYear = indepYear;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public String getPopulation() {
        return Population;
    }

    public void setPopulation(String population) {
        Population = population;
    }

     String Capital;
     String Population;

}
