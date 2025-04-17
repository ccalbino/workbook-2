package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String input = "Dallas|Ft. Worth|Austin";
        String[] cities = input.split("\\|");
        System.out.println(cities[0]);
    }
}