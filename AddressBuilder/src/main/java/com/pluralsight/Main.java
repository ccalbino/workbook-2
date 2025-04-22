package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Full name \n");
        String name = scanner.nextLine();

        System.out.println("Billing Street");
        String billingStreet = scanner.nextLine();

        System.out.println("Billing City");
        String billingCity = scanner.nextLine();

        System.out.println("Billing State");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip\n");
        int billingZip = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Shipping Street");
        String shippingStreet = scanner.nextLine();

        System.out.println("Shipping City");
        String shippingCity = scanner.nextLine();

        System.out.println("Shipping State");
        String shippingState = scanner.nextLine();

        System.out.println("Shipping Zip");
        int ShippingZip = scanner.nextInt();

        StringBuilder sb = new StringBuilder(11);
        sb.append(name);
        sb.append("\n");
        sb.append("Billing Address \n");
        sb.append(billingStreet);
        sb.append("\n");
        sb.append(billingCity + ", ");













    }
}