package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is you name. \n Please put whole name. (First, Middle initial, and Last");
        String fullName = scanner.nextLine().trim();

        int firstSpacePosition = fullName.indexOf(" ");
        String firstName = fullName.substring(0, firstSpacePosition);
        System.out.println("First Name: " + firstName);




        int secondSpacePosition = fullName.indexOf(" ", firstSpacePosition + 1);
        if (secondSpacePosition > 0) {
            String middleName = fullName.substring(firstSpacePosition, secondSpacePosition + 1);
            System.out.println("Middle Name: " + middleName);
        }else {
            String middleName = "(none)";
            System.out.println("Middle Name: " + middleName);
        }










    }
}


//        //establish known value
//        System.out.println("What is your name?: ");
//        String input =
//        String name = scanner.nextLine().trim();
//
//
//
//        //caculate the unkown
//        String firstName = "" ;
//        int firstNameIndex = name.indexOf(" ");
//
//
//
//
//        String middleName = "" ;
//        int secondSpaceIndex = name.indexOf(" ", firstNameIndex +1);
//
//
//
//
//        String lastName = "" ;
//
//
//
//
//
//        //display results
//        System.out.println();
//        System.out.println("First Name: " + firstName);
//        System.out.println("Middle Name: " + middleName);
//        System.out.println("Last Name: " + lastName);
//
//
//
//
//    }
//}