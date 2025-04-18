package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter you name");

        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();


        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();



        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();



        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();




        //compute the unknown

        String fullName = "";

        if(middleName.isBlank()){
            fullName = firstName +  " " + lastName; //+ suffix;

        }
        else{
            fullName = firstName + " " + middleName + " " + lastName;

        }
        if (!suffix.isBlank()){
            fullName += ", " + suffix;
        }

        System.out.println("Full name: " + fullName);
//
//        if (middleName.isEmpty()) {
//            fullName = fullName +  " " + lastName + suffix;
//        }
//
//        if (suffix.isEmpty()) {
//            fullName = fullName + " " + lastName;
//
//        }
//
//        System.out.println("Full name: " + fullName);




    }
            
            
        }






