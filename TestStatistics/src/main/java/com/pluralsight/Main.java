package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        int[] testScores = {88, 73, 55, 95, 90, 84, 50, 93, 81, 87};
        int sum = 0;
        int max = testScores[0];


        //for each loop to find max
//        for (int i = 0; i < testScores.length; i++ ) {
//            if (testScores[i] > max){
//                max = testScores[i];
//
//            }
//            System.out.println(max);
//        }


        //for each loop to find avg
        for (int num : testScores){
            sum = sum + num;
        }
        double average = (double) sum / testScores.length;

        System.out.println("Average is : " + average);


        int highest = 0;
        for (int i = 0; i < testScores.length; i++ ) {
            if (testScores[i] > highest){
                highest = testScores[i];
            }
        }
        System.out.println("The highest value is: " + highest);


        }


    }
