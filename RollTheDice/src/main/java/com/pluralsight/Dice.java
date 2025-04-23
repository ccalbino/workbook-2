package com.pluralsight;

public class Dice {
    public int  roll(){
                          //int(Math.random() * maxValue) + min value
                          //generates random number between 1 and 6
        int randomNumber = (int)(Math.random() * 6) + 1;
        return randomNumber;
    }
}
