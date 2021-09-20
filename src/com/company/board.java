package com.company;

import java.util.Scanner;

public class board {

    public int n;
    public String[][] gameBoard= new String[(2 * n)+1][(2 * n) + 1];

    public void createBoard(String[][] gameBoard, int n){
        //loop to generate board to play
        for(int i=0;i<2*n+1;i++){
            for(int j=0;j<2*n+1;j++)
            {
                if(i%2==0)
                {
                    if(j%2==0)
                        gameBoard[i][j] = "+";
                    else
                        gameBoard[i][j] = "--";
                }
                else
                {
                    if(j%2==0)
                    {
                        gameBoard[i][j]="|";
                    }
                    else
                    {
                        gameBoard[i][j]="  ";
                    }
                }
            }
        }
        printBoard(gameBoard);
    }

    public void printBoard(String[][] gameBoard) {
        //loop to print out the board
        for (String[] row : gameBoard) {
            for (String c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}


