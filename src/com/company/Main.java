package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    Country country = new Country("Britain", "Europe", "1900", "London", "200000");
    public static void main(String[] args) {
        List <Country> country = new LinkedList<>();

        country.add(new Country("Britain", "Europe", "1900", "London", "200000"));
        country.add(new Country("Spain", "Europe", "399", "Madrid", "272722"));
        country.add(new Country("Mexico", "USA", "1200", "Mexico", "37474"));
        country.add(new Country("Egypt", "Africa", "200", "Irusalim", "947474"));
        Collections.sort(country, new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return ((Country)o1).Name.compareTo(((Country)o2).Name);
            }
        });
        for (Country c : country) {
            System.out.println(c.Name );
        }
    }

}
