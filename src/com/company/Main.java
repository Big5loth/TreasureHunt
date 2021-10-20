package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[][] board = new String[5][5];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int coins = random.nextInt(100);
        int locationX = random.nextInt(5);
        int locationY = random.nextInt(5);
        board[locationX][locationY] = Integer.toString(coins);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = "[]";
                System.out.print(board[i][j]);
            }
            System.out.println("");

        }
        boolean coinsFound = false;
        board[locationX][locationY] = Integer.toString(coins);
        while (!coinsFound) {
            System.out.println("What is your guess?");
            int guessX = input.nextInt();
            int guessY = input.nextInt();
            if (guessX == locationX && (guessY) == (locationY)) {
                System.out.println("Correct, you gained " + coins + " coins");
                coinsFound = true;
            } else {
                System.out.println("Incorrect, try again");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        board[i][j] = "[]";
                        board[guessX][guessY] = "[X]";
                        System.out.print(board[i][j]);}}
            }
        }
    }
}