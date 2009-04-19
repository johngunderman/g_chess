package org.gChess;

import java.util.ArrayList;

/** 
 * This class is effectively an array of ChessPiece objects.
 * Also included are methods for finding legal moves
 * and moving pieces.
 */
public class ChessBoard {
	
	private ChessPiece[][] grid;
	private ArrayList<ChessPiece> whitePieces;
	private ArrayList<ChessPiece> blackPieces;
	
	
	public ChessBoard() {
		grid = new ChessPiece[8][8];
		setGridToNull();
		
		//TODO: we need to make ourselves some chessPieces here,
		// but we haven't made our classes yet :(
	}
	
	/**
	 * This method flushes out our grid to all null values...
	 * as if it wasn't obvious enough by the name of the method,
	 * but "good documentation" procedure and all that is sometimes
	 * overkill. Now lets all go sing camp-fire songs and dance in a
	 * circle.
	 */
	private void setGridToNull() {
		for (int x=0; x < grid.length; x++) {
			for (int y=0; y < grid[x].length; y++) {
				grid[x][y] = null;
			}
		}
	}
	
}
