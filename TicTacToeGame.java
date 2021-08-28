package com.brideglab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame { 
	
	public static char[] ticTacToeBoard() {  //UC1
		char[] boardArr = new char[10];
		for(int i=1;i<boardArr.length;i++) {
			boardArr[i]='_';
		}
		return boardArr;
		
	}
	
	public char selectSymbol(){
        System.out.print("select the symbol for user X or 0");
        Scanner sc = new Scanner(System.in);
        char symbolP= sc.next().charAt(0);
        return symbolP ;
    }
	
	public void showBoard(char[] boardArr) {
		for (int i=1;i< boardArr.length;i++){
            System.out.print(boardArr[i]+"\t");
            if (i%3==0)
            {
                System.out.println();
            }
		}
		
	}
	
}
