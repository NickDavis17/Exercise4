package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Double> arrL = new ArrayList<>();
    public static void main(String[] args) {
        Map<String, Double> hashMap = new HashMap<>();
        userInput(hashMap);




    }

    static void userInput(Map<String, Double> a) {

        String city = "null";
        while (!city.equalsIgnoreCase("END")) {
            System.out.println("Please list a city:");
            city = input.next();
            if (!city.equalsIgnoreCase("END")) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("What is the temperature there?");
                    Double temp = input.nextDouble();
                    arrL.add(temp);


                }
                avgTemp();
                a.put(city, avgTemp());
                //System.out.println("Please list a city: (To Exit type END)");
                //city = input.next();
                arrL.clear();
            }
            else {
                display(a);
                System.exit(0);
            }
        }
        System.out.println(a);

    }

    static double avgTemp(){
        double avg = 0;
        double total = 0;
        for (int i = 0; i < arrL.size(); i++) {

            total = arrL.get(i) + total;

        }
        avg = total / arrL.size();
        //System.out.println(avg);
        return avg;
    }
    static void display(Map<String, Double> a){
        System.out.println(a);


    }
}
