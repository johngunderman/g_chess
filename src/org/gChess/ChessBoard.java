package org.gChess;

import java.util.ArrayList;

/** 
 * This class is effectively an array of ChessPiece objects.
 * Also included are methods for finding legal moves
 * and moving pieces.
 */
public class ChessBoard {
	
	private ChessSquare[][] grid;
	private ArrayList<ChessPiece> whitePieces;
	private ArrayList<ChessPiece> blackPieces;
	
	
	public ChessBoard() {
		grid = new ChessSquare[8][8];
		initGrid();
		//TODO: we need to make ourselves some chessPieces here,
		// but we haven't made our classes yet :(
	}
	
	
	/**
	 * This method puts all our squares in the grid, ready for
	 * hard-core chess-piece placing action.
	 */
	private void initGrid() {
		for (int x=0; x < grid.length; x++) {
			for (int y=0; y < grid[x].length; y++) {
				grid[x][y] = new ChessSquare();
			}
		}
	}
	
}
