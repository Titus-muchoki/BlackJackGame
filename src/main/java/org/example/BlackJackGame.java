package org.example;

import java.util.Random;
import java.util.Scanner;

public class BlackJackGame {

    //    public boolean runBlackJack() {
//        int dealerChoice = 0, userChoice, card1, card2, card3, card4, card5;
//        Scanner scanner = new Scanner(System.in);
//        Random rdm = new Random();
//        card1 = 10;
//        card2 = 10;
//        card3 = 10;
//        card4 = 11;
//        System.out.println("Enter the BLACKJACK-GAME");
//        System.out.println("pick your cards,(card1,card2,card3,card4)");
//        userChoice = scanner.nextInt();
//        while (userChoice > 21) {
//            System.out.println("it`s a burst");
//            userChoice = scanner.nextInt();
//        }
//        // USER PICK CARD FOR THE GAME.
//        if (userChoice == card1) {
//            System.out.println("user choose J");
//        } else if (userChoice == card2) {
//            System.out.println("user choose Q");
//
//        } else if (userChoice == card3) {
//            System.out.println("user choose K");
//
//        } else {
//            System.out.println("user choose A");
//
//        }
//        //DEALER RANDOM PICK
//        boolean b = dealerChoice == rdm.nextInt();
//        if (dealerChoice > 20 && dealerChoice <= 22) {
//            System.out.println("the dealer have the win");
//
//        } else if (dealerChoice == card1) {
//            System.out.println("the dealer have J");
//
//        } else if (dealerChoice == card2) {
//            System.out.println("the dealer choose Q");
//
//        } else if (dealerChoice == card3) {
//            System.out.println("the dealer have K");
//
//        } else {
//            System.out.println("the dealer have A");
//        }
//        //result
//        while (dealerChoice == userChoice) {
//            System.out.println("the game is a draw");
//            dealerChoice = rdm.nextInt();
//
//        }
//        return true;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Blackjack!");

        int playerScore = 0;
        int dealerScore = 0;

        // player's turn
        while (playerScore < 21) {
            System.out.println("Your current score is " + playerScore + ".");
            System.out.println("Would you like to (1) hit or (2) stay?");

            int playerChoice = input.nextInt();

            if (playerChoice == 1) {
                // hit
                int newCard = (int) (Math.random() * 10) + 1;
                playerScore += newCard;
                System.out.println("You drew a " + newCard + ".");
            } else if (playerChoice == 2) {
                // stay
                System.out.println("You stayed.");
                break;
            } else {
                System.out.println("Invalid input.");
            }


        }
    }
}






