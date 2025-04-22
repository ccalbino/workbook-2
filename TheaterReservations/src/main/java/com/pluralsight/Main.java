package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        String[] nameSplit = name.split(Pattern.quote(" "));
        String firstName = nameSplit[0];
        String lastName = nameSplit[1];



        System.out.println("What date will you be coming? (MM/dd/yyyy)");
        String date = scanner.nextLine();
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservationDate = LocalDate.parse(date, formatter);


        System.out.println("How many tickets would you like?");
        int tickets = scanner.nextInt();

        if (tickets <= 1 ){
            System.out.println(tickets + " ticket reserved for " + reservationDate + " under " + lastName + ", "  + firstName );
        }else{
            System.out.println(tickets + " tickets reserved for " + reservationDate + " under " + lastName + ", "  + firstName  );
        }


    }
}