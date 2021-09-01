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
	public boolean toss() {
		int toss = (int)(Math.random()*10)%2;
		if(toss == 0) {
			System.out.println("player won the toss");
			return true;
		}
		else {
			System.out.println("player loss the toss");
			return false;
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
	
	public char[] checkPosition(char boardArr[],char player) {
		Scanner sc = new Scanner(System.in);
		int position =0;
		//char player = 0;
		while(true) {
			System.out.println("\nEnter the index to set value from 1 to 9: ");
			position = sc.nextInt();
			if (position <= 9 || position>0) {
				if (emptyPosition(boardArr, position)) {
					boardArr[position] = player;
				}
				else
				{
					System.out.println("Entered Index is not Free");
				}
			}
			return boardArr;
			 
		}
		
	
	}
	public char[] computerMove(char[] board, char gameCharacter) { //UC8
			
			for(int i=1;i<board.length;i++) {
				char[] boardArr = board;
					if (checkWin(boardArr)) {
						board[i]=gameCharacter;
						return board;
					}
				
			}
			return board;
		}
	public boolean checkWin(char[] boardArr) {
		if(boardArr[1] == boardArr[2] && boardArr[2] == boardArr[3] && boardArr[3]!= '_') return true;
		else if(boardArr[1] == boardArr[5] && boardArr[5] == boardArr[9] && boardArr[9]!= '_') return true;
		else if(boardArr[1] == boardArr[4] && boardArr[4] == boardArr[7] && boardArr[7]!= '_') return true;
		else if(boardArr[2] == boardArr[5] && boardArr[5] == boardArr[8] && boardArr[8]!= '_') return true;
		else if(boardArr[3] == boardArr[5] && boardArr[5] == boardArr[7] && boardArr[7]!= '_') return true;
		else if(boardArr[3] == boardArr[6] && boardArr[6] == boardArr[9] && boardArr[9]!= '_') return true;
		else if(boardArr[4] == boardArr[5] && boardArr[5] == boardArr[6] && boardArr[6]!= '_') return true;
		else if(boardArr[7] == boardArr[8] && boardArr[8] == boardArr[9] && boardArr[9]!= '_') return true;
		return false;
	}
	private int opponentWin(char[] board,char opponentCharacter,char gameCharacter) {
			
			for(int i=1;i<board.length;i++) {
				if(board[i] == '_') {
					board[i] = opponentCharacter;
					if(checkPlayerWin(board, opponentCharacter)) {
						return i;
					}
					else board[i] = '_';
				}
			}		
			return 0;
		}
	
	private boolean checkPlayerWin(char[] boardArr,char player) {
		int size = boardArr.length;
		for(int i=1;i<size;i++) {
			if(boardArr[i] == '_') {
				boardArr[i] = player;
				if(checkWin(boardArr)) {
					checkPosition(boardArr,player);
					return true;
				}
				else boardArr[i] = '_';
			}
		}		
		return false;
	}
	
}
