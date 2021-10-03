package com.company;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Country implements Server {
    String Capital;
    int Population;
    String Name;
    String Continent;
    Integer IndepYear;


    public Country(String name, String continent, Integer indepYear, String capital, int population) {
        Name = name;
        Continent = continent;
        IndepYear = indepYear;
        Capital = capital;
        Population = population;
    }


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

    public Integer getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(Integer indepYear) {
        IndepYear = indepYear;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Capital='" + Capital + '\'' +
                ", Population=" + Population +
                ", Name='" + Name + '\'' +
                ", Continent='" + Continent + '\'' +
                ", IndepYear=" + IndepYear +
                '}';
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }


    @Override
    public void showCountry() {

        System.out.println();
    }



}



