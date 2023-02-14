package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    static char[] board = new char[10];
    static Scanner sc = new Scanner(System.in);
    static char playerLetter;
    static char computerLetter;

    static void createBoard(char[] board) {

        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }

    static void getLetter() {
        System.out.println("Choose the letter(X or O)");
        playerLetter = sc.next().toUpperCase().charAt(0);
        computerLetter = (playerLetter == 'X') ? 'O' : 'X';
        System.out.println("Your Letter is " + playerLetter);
        System.out.println("Computer Letter is " + computerLetter);
    }

    public static void main(String[] args) {

        createBoard(board);
        getLetter();
    }
}