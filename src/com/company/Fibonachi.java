package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonachi {
    Scanner sc = new Scanner(System.in);

    public void fibValue(){
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        List<Integer> list =new ArrayList<>();
        int first = 0;
        int sec = 1;
        int result;
        list.add(first);
        list.add(sec);
        for(int i = 2; i < n; i++) {
            result = sec + first;
            first = sec;
            sec = result;
            list.add(result);
        }
        System.out.println(list);
    }

    }


