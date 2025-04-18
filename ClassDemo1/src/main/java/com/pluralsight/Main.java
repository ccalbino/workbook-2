package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the person's full name: ");
        String fullName = scanner.nextLine();

        System.out.print("What is the person's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); //clear CRLF meaning the line after can run a string due to this one being a int

        System.out.print("What is the person's profession: ");
        String profession = scanner.nextLine();


        //these are both methods: We need to define it below to see it
        displayPerson(fullName, age, profession);
        savePerson(fullName, age, profession);



    }

    /// define display person method. public static void because it is a method
    public static void displayPerson(String fullName, int age, String profession){
        System.out.printf("Person %s is a %s and is %d years old", fullName, profession, age);

    }

    public static void savePerson(String fullName, int age, String profession){
        //do the work of saving a person to a database

    }
}