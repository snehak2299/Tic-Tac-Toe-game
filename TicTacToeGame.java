package com.brideglab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame { 
	
	public char[] ticTacToeBoard() {  //UC1
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
	public boolean emptyPosition(char boardArr[], int position) {
		for (int i=1;i<boardArr.length;i++) {
			if (i==position && boardArr[i]=='_') {
				return true;
			}
		}
		return false;
	}
	
	public int checkPosition(char boardArr[],char symbolP) {
		Scanner sc = new Scanner(System.in);
		int position =0;
		while(true) {
			System.out.println("\nEnter the index to set value from 1 to 9: ");
			position = sc.nextInt();
			if (position <= 9 || position>0) {
				if (emptyPosition(boardArr, position)) {
					return position;
				}
				else
				{
					System.out.println("Entered Index is not Free");
				}
			}
			 
		}
		
	
			
	}
	
	
	
}
