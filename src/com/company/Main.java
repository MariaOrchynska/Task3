package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Country country = new Country("Britain", "Europe", 366, "London", 20000);
        List<Country> countrys = new LinkedList<>();

        countrys.add(new Country("Britain", "Europe", 666, "London", 200000));
        countrys.add(new Country("Spain", "Europe", 122, "Madrid", 272722));
        countrys.add(new Country("Mexico", "USA", 444, "Mexico", 37474));
        countrys.add(new Country("Egypt ", "Africa", 1234, "Irusalim", 947474));
        Collections.sort(countrys, new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return ((Country) o1).Name.compareTo(((Country) o2).Name);
            }
        });
        System.out.println("Sorted countries : ");
        for (Country c : countrys) {
            System.out.println(c.Name);
        }
        //Sorting year

        System.out.println("Sorted IndependanceYear : ");
           Collections.sort(countrys, new Comparator<Country>() {
               @Override
               public int compare(Country  o1, Country o2) {
                   return ((Country) o1).IndepYear.compareTo(((Country) o2).IndepYear);
               }
           });
            for (Country s : countrys) {
                System.out.println(s.IndepYear);
           }


        System.out.println("\nSelect the country : ");
        String choice = sc.next();
        switch (choice){
            case("Britain"):
                System.out.println(countrys.get(0).toString()); break;
            case("Egypt"):
                System.out.println(countrys.get(1).toString()); break;
            case("Mexico"):
                    System.out.println(countrys.get(2).toString()); break;
            case("Spain"):
                System.out.println(countrys.get(3).toString()); break;

        }



        }


    }

