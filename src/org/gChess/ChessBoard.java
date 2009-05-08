package org.gChess;

import java.util.ArrayList;

/** 
 * This class is effectively an array of ChessPiece objects.
 * Also included are methods for finding legal moves
 * and moving pieces.
 */
public class ChessBoard {
	
	public static final int ROWS = 8;
	public static final int COLS = 8;
	
	private ChessSquare[][] grid;
	private ArrayList<ChessPiece> whitePieces;
	private ArrayList<ChessPiece> blackPieces;
	private int height;
	private int width;
	
	/**
	 * Creates a new chess board with width and height in pixels.
	 * (so we can fit the screen size)
	 * @param width
	 * @param height
	 */
	public ChessBoard(int width, int height) {
		this.height = height;
		this.width = width;
		grid = new ChessSquare[ROWS][COLS];
		initGrid();
		//TODO: we need to make ourselves some chessPieces here,
		// but we haven't made our classes yet :(
	}
	
	
	
	/**
	 * wraps a call to the move method of the chess piece to be moved.
	 * @param cp
	 */
	public void movePiece(ChessPiece cp) {
		//TODO	
	}
	
	
	/**
	 * This method puts all our squares in the grid, ready for
	 * hard-core chess-piece placing action.
	 */
	private void initGrid() {
		for (int x=0; x < grid.length; x++) {
			for (int y=0; y < grid[x].length; y++) {
				grid[x][y] = new ChessSquare(width, height);
			}
		}
	}

	/**
	 * @param loc
	 * @return the ChessPiece at the given Location.
	 * <code>null</code> if no ChessPiece at that location
	 */
	public ChessPiece getPieceAt(Location loc) {
		ChessSquare cs = grid[loc.getRow()][loc.getCol()];
		return cs.getOccupant();
	}
	
	
	public void putPiece(Location loc) {
		//TODO
	}
	
	/**
	 * @param loc
	 * @return true if the Location is occupied, false otherwise.
	 */
	public boolean isOccupied(Location loc) {
		return getPieceAt(loc) != null;
	}
	
}
