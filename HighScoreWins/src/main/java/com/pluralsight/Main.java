package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the score of the game. \n Please input as follows: \n  Home : Vistor | 21 : 9 ");
        String score = scanner.nextLine();


        String[] firstSplit = score.split(Pattern.quote("|"));
//        String[] teamSplit = score.split(Pattern.quote(":"));
        String teams = firstSplit[0];
        String scores = firstSplit[1];

        String[] teamNames = teams.split(Pattern.quote(":"));
        String homeTeam = teamNames[0].trim();
        String awayTeam = teamNames[1].trim();

        String[] scoresArray = scores.split(Pattern.quote(":"));
        int homeScore = Integer.parseInt(scoresArray[0].trim());
        int awayScore = Integer.parseInt(scoresArray[1].trim());


        if (homeScore > awayScore){
            System.out.println("Winner: " + homeTeam);
        }if (awayScore > homeScore){
            System.out.println("Winner: " + awayTeam);
        }
//        int homeScore = Integer.parseInt(scoreSplit[0]);
//        int awayScore = Integer.parseInt(scoreSplit[0]);
//        System.out.println(teams);
//        System.out.println(scores);
//        System.out.println(homeTeam);
//        System.out.println(awayTeam);
//        System.out.println(homeScore);
//        System.out.println(awayScore);
//        System.out.println(homeTeam);








    }
}