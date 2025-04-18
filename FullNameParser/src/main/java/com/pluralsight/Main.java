package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //establish known value
        System.out.println("What is your name?: ");
        String input =
        String name = scanner.nextLine().trim();



        //caculate the unkown
        String firstName = "" ;
        int firstNameIndex = name.indexOf(" ");




        String middleName = "" ;
        int secondSpaceIndex = name.indexOf(" ", firstNameIndex +1);




        String lastName = "" ;





        //display results
        System.out.println();
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);




    }
}