package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Country country = new Country("Britain", "Europe", 366, "London", 20000);
        List<Country> countrys = new LinkedList<>();

        countrys.add(new Country("Britain", "Europe", 666, "London", 200000));
        countrys.add(new Country("Spain", "Europe", 122, "Madrid", 272722));
        countrys.add(new Country("Mexico", "USA", 444, "Mexico", 37474));
        countrys.add(new Country("Egypt ", "Africa", 1234, "Cairo", 947474));
        countrys.add(new Country("Afghanistan ", "USA", 134, "Kabul", 947474));
        countrys.add(new Country("Albania ", "Europe", 12634, "Tirana", 94474));
        countrys.add(new Country("Dominica ", "Africa", 124, "Roseau", 9498474));
        countrys.add(new Country("France ", "Europe", 1454, "Paris", 943454));
        countrys.add(new Country("Ecuador ", "Africa", 1234, "Quito", 45342));
        countrys.add(new Country("Kenya ", "Africa", 1234, "Nairobi", 8654));
        countrys.add(new Country("Maldives ", "Asia", 12864, "Male", 4342));
        countrys.add(new Country("Monaco ", "Asia", 1264, "Monaco", 7784));
        countrys.add(new Country("Seychelles ", "Africa", 1238, "Victoria", 2344));
        countrys.add(new Country("Malaysia ", "Africa", 1086, "Kuala", 864));

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
            public int compare(Country o1, Country o2) {
                return ((Country) o1).IndepYear.compareTo(((Country) o2).IndepYear);
            }
        });
        for (Country s : countrys) {
            System.out.println(s.IndepYear);
        }


        System.out.println("\nSelect the country : ");
        String choice = sc.next();
        switch (choice) {
            case ("Britain"):
                System.out.println(countrys.get(4).toString());
                break;
            case ("Egypt"):
                System.out.println(countrys.get(7).toString());
                break;
            case ("Mexico"):
                System.out.println(countrys.get(3).toString());
                break;
            case ("Spain"):
                System.out.println(countrys.get(0).toString());
                break;
            case ("Dominica"):
                System.out.println(countrys.get(1).toString());
                break;
            case ("Afghanistan"):
                System.out.println(countrys.get(2).toString());
                break;
            case ("Malaysia"):
                System.out.println(countrys.get(5).toString());
                break;
            case ("Ecuador"):
                System.out.println(countrys.get(6).toString());
            case ("Maldives"):
                System.out.println(countrys.get(13).toString());
                break;
            case ("Kenya"):
                System.out.println(countrys.get(8).toString());
                break;
            case ("Seychelles"):
                System.out.println(countrys.get(9).toString());
                break;
            case ("Monaco"):
                System.out.println(countrys.get(10).toString());
                break;
            case ("France"):
                System.out.println(countrys.get(11).toString());
                break;
            case ("Albania"):
                System.out.println(countrys.get(12).toString());
                break;

            default:
                System.out.println(("The country has not found " + choice));

        }
        System.out.println("\nSelect the continent : ");
        String str = sc.next();
        switch (str) {
            case ("Europe"):
                System.out.println(countrys.get(4));
                System.out.println(countrys.get(0));
                System.out.println(countrys.get(12));
                System.out.println(countrys.get(11));
                break;
            case ("Usa"):
                System.out.println(countrys.get(3));
                System.out.println(countrys.get(2));

                break;
            case ("Africa"):
                System.out.println(countrys.get(1));
                System.out.println(countrys.get(5));
                System.out.println(countrys.get(6));
                System.out.println(countrys.get(7));
                System.out.println(countrys.get(8));
                System.out.println(countrys.get(9));
            case("Asia"):
                System.out.println(countrys.get(13));
                System.out.println(countrys.get(10));
                break;

            default:
                System.out.println(("The country has not found " + choice));
        }


    }


}

