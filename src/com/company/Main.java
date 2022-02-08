package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        userInput(hashMap);



    }

    static void userInput(Map<Integer, String> a) {

        String city = null;
        while (city.equals("END")) {
            System.out.println("Please list a city:");
            city = input.next();
            for (int j = 0; j < 5; j++) {
                System.out.println("What is the temperature there?");
                Integer temp = input.nextInt();
                a.put(temp, city);
            }
            System.out.println("Please list a city: (To Exit type END)");
            city = input.next();
        }


        System.out.println(a);


    }
}
