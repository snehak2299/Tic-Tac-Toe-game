package com.brideglab.tictactoe;

public class TicTacToeMain {

	public static void main(String[] args) {
		TicTacToeGame ticTacToe = new TicTacToeGame();
		char board[]= ticTacToe.ticTacToeBoard();
		char userSelect = ticTacToe.selectSymbol();
		char symbolCom;
        if(userSelect =='X') {
        	symbolCom='O';
        }
        else {
        	symbolCom='X';
        }
        System.out.println("computer symbol "+ symbolCom);
        ticTacToe.showBoard(board);
       // ticTacToe.checkPosition(board,userSelect);
        if (ticTacToe.toss()) {
			board = ticTacToe.checkPosition(board,userSelect);
		}
		else board = ticTacToe.checkPosition(board, symbolCom);
		ticTacToe.showBoard(board);
		ticTacToe.checkPosition(board,userSelect);
		System.out.print("Computer ");
		board = ticTacToe.computerMove(board, symbolCom);
		if (ticTacToe.checkPlayerWin(board,symbolCom)) {
			System.out.println("Computer won.");
		ticTacToe.checkWin(board);
		ticTacToe.computerMove(board, symbolCom);
		}
	}
	 

}
