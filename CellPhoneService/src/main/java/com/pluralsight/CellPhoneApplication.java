package com.pluralsight;

import java.util.Scanner;


public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.println("serial number: ");
        phone.setSerialNumber(Integer.parseInt((scanner.nextLine())));



        System.out.println("Model: ");
        String model = scanner.nextLine();
        phone.setModel(model);



        System.out.println("carrier: ");
        String carrier =scanner.nextLine();
        phone.setCarrier(carrier);



        System.out.println("phoneNumber: ");
        String phoneNumber = scanner.nextLine();
        phone.setPhoneNumber(phoneNumber);



        System.out.println("owner: ");
        String owner = scanner.nextLine();
        phone.setOwner(owner);


        System.out.println("Your serial number is " + phone.getSerialNumber());
        System.out.println("Your model is " + phone.getModel());
        System.out.println("Your Carrier is " + phone.getCarrier());
        System.out.println("Your phone number is " + phone.getPhoneNumber());
        System.out.println(phone.getOwner() + " is the owner of the car");


    }

}