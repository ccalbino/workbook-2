package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{



        for (int i = 10; i >= 1; i--){
            Thread.sleep(1000);
            System.out.println(i);
            //System.out.println("LAUNCH");


        }
        System.out.println("LAUNCH");


    }
}
