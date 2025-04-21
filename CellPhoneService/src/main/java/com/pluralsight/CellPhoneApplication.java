package com.pluralsight;

import java.util.Scanner;


public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.println("Serial Number: ");
        phone.setSerialNumber(Integer.parseInt((scanner.nextLine())));

        System.out.println("Model: ");
        String model = scanner.nextLine();

        System.out.println("carrier: ");
        String setcarrier =scanner.nextLine();

        System.out.println("phoneNumber: ");
        String setphoneNumber = scanner.nextLine();

        System.out.println("owner: ");
        String setowner = scanner.nextLine();

    }
}