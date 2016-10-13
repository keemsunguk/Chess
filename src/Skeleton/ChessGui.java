package Skeleton;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class ChessGui extends GraphicsProgram {

	final int ROW = 8;
	final int COL = 8;
	GRect [][] board;
	private GPoint c;
	private double side = 0;

	
	public void init() {
		setSize(640,740);
		setTitle("Kugnus Chess");
		board = new GRect[COL][ROW];
		c = new GPoint(getWidth()/2, getHeight()/2);	//center
		side = (Math.min(getWidth(), getHeight())- 100)/ROW;
	}
	
	private void SetBoard() {
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COL; j++) {
				board[i][j] = new GRect((c.getX()-side*COL/2)+side*i, (c.getY()-side*ROW/2)+side*j, side, side);
				board[i][j].setFilled(true);
				if( (i+j)%2 == 0 ) {
					board[i][j].setColor(Color.YELLOW);
				} else {
					board[i][j].setColor(Color.LIGHT_GRAY);
				}
				add(board[i][j]);
			}
		}
	}
	
	public void run() {
		SetBoard();
	}
	
}
