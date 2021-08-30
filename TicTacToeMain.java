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
        ticTacToe.checkPosition(board,userSelect);
        //ticTacToe.showBoard(board);
    
	}

}
