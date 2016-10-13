package Skeleton;

import java.util.Scanner;

public class ChessLogic {
	public String [][] board = null;
	
	private static final int ROWS = 8; 
	private static final int COLS = 8; 
	private static String SPACE = " ";
	
	/*
	 * Constructor
	 */
	ChessLogic() { 
		board = new String[ROWS][COLS];
		
/*		board[0][0] = SPACE;
		board[0][1] = SPACE;
		board[0][2] = SPACE;
		board[1][0] = SPACE;
		board[1][1] = SPACE;
		board[1][2] = SPACE;
		board[2][0] = SPACE;
		board[2][1] = SPACE;
		board[2][2] = SPACE;
*/
		for(int r = 0; r < ROWS; r++) {
			for(int c = 0; c < COLS; c++) {
				board[r][c] = SPACE;
			}
		}
		
	}
	
	/*
	 * Name: toString
	 * @return String version of board
	 * Printing the board
	 * 
	 */
	public String toString() {
		String local_board = "";
		
		
		return local_board;
	}
	
	/*
	 * Name: numMoves
	 * @return  Returns number of occupied locations
	 */
	public int numMoves() {
		int local_occupied = 0;
		
				
		return local_occupied;
	}
	
	/*
	 * Name isValid
	 * @param: row, col poistion vector
	 * @return: true if the location is SPACE
	 */
	private boolean isValid(int row, int col) {	
		
		return false;
		
	}

	/*
	 * Name hasWon
	 * @param XorO
	 * @return true if X or O appears three in a row
	 */
	public boolean hasWon(String XorO) {
		
		
		return false;
	}
	
	/* Name isDraw 
	 * @param
	 * @return true if the game is a draw
	 */
	public boolean isDraw() {
		return false;
	}
	
	/*
	 * 
	 */
	public void makeMove(String XorO) {
		System.out.println("Please Enter Your Move: ");
        
        int row = 0;
        int col = 0;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Row#");
        row = inp.nextInt();
        System.out.print("Enter Col#");        
        col = inp.nextInt();
        
        
		set(row, col, XorO);
	}
	
	/*
	 * 
	 */
	private void set(int row, int col, String XorO) {
		board[row][col] = XorO;	
	}
}

