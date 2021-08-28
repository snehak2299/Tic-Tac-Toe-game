package com.brideglab.tictactoe;

public class TicTacToeGame {
	char[] boardArr = new char[10]; 
	
	public void ticTacToeBoard() {
		for(int i=1;i<boardArr.length;i++) {
			boardArr[i]=' ';
		}
	}
}
