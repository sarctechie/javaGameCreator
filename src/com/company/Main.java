package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        board gBoard= new board();
        Scanner scan= new Scanner(System.in);
        gBoard.n= scan.nextInt();
        gBoard.gameBoard= new String[2* gBoard.n+1][2*gBoard.n+1];
        gBoard.createBoard(gBoard.gameBoard, gBoard.n);

    }
}
