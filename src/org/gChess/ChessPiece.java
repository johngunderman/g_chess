package org.gChess;

/** 
 * This class contains all the base methods for each chess piece
 */
public abstract class ChessPiece {

	/**
	 * apparently enums don't play to happily with limited cpu
	 * cycles, so these will have to take up the slack.
	 * These class vars are for determining the "team" aka color
	 * of a ChessPiece
	 */
	public final static int BLACK = 0;
	public final static int WHITE = 1;
	
	/**
	 * it is quite possible that this is the most pointless comment
	 * so far: the color variable records what color our ChessPiece is.
	 * Yipee.
	 */
	private int color;
	
	private ChessPiece(int color) {
		switch (color) {
		case BLACK: {
			this.color = BLACK;
			break;
		}
		case WHITE: {
			this.color = WHITE;
			break;
		}
		default: {
			//TODO: get this off of runtime exception
			throw new RuntimeException("Cannot create a chess piece who's color is not black or white");
		}
		}
	}
	
}
