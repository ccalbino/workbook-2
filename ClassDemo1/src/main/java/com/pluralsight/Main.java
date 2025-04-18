package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName;
        int age;
        String profession;



        System.out.print("What is the person's full name: ");
        fullName = scanner.nextLine();

        System.out.print("What is the person's age: ");
        age = scanner.nextInt();
        scanner.nextLine(); //clear CRLF meaning the line after can run a string due to this one being a int

        System.out.print("What is the person's profession: ");
        profession = scanner.nextLine();

        Person thePerson = new Person(fullName, age, profession);




        System.out.print("What is the person's full name: ");
         fullName = scanner.nextLine();

        System.out.print("What is the person's age: ");
         age = scanner.nextInt();
        scanner.nextLine(); //clear CRLF meaning the line after can run a string due to this one being a int

        System.out.print("What is the person's profession: ");
         profession = scanner.nextLine();



        Person theOtherPerson = new Person(fullName, age, profession);

        System.out.println(thePerson.getFullName());

        System.out.println(theOtherPerson.getFullName());



//        //these are both methods: We need to define it below to see it
        displayPerson(thePerson);
        displayPerson(theOtherPerson);



    }

    /// define display person method. public static void because it is a method
    public static void displayPerson(Person person){
        System.out.printf("Person %s is a %s and is %d years old", person.getFullName(), person.getProfession(), person.getAge());

    }

    public static void savePerson(String fullName, int age, String profession){
        //do the work of saving a person to a database

    }
}