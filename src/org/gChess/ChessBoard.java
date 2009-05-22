package org.gChess;

import java.util.ArrayList;

import android.graphics.Canvas;
import android.location.Address;
import android.util.Log;

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
	private ChessView view;
	/**
	 * Creates a new chess board with width and height in pixels.
	 * (so we can fit the screen size)
	 * @param width
	 * @param height
	 */
	public ChessBoard(ChessView view) {
		this.view = view;
		grid = new ChessSquare[ROWS][COLS];
		initGrid();
		initPieces();
		//TODO: we need to make ourselves some chessPieces here
	}
	
	public ChessView getView() {
		return view;
	}
	
	/**
	 * wraps a call to the move method of the chess piece to be moved.
	 * @param cp
	 */
	public void movePiece(ChessPiece cp, Location loc) {
		//TODO	
	}
	
	
	/**
	 * This method puts all our squares in the grid, ready for
	 * hard-core chess-piece placing action.
	 */
	private void initGrid() {
		for (int x=0; x < grid.length; x++) {
			for (int y=0; y < grid[x].length; y++) {
				grid[x][y] = new ChessSquare(new Location(y,x));
			}
		}
	}
	
	/** draws the chessboard onto the passed canvas.
	 * @param canvas
	 */
	protected void render(Canvas canvas) {
		int squareLength = canvas.getWidth() / COLS;
		int squareHeight = (canvas.getHeight() - 20) / ROWS;
		for (int x=0; x< grid.length; x++) {
			for (int y=0; y < grid[x].length; y++) {
				grid[y][x].setSize(squareLength, squareHeight, new Location(y,x));
				grid[y][x].render(canvas);
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
	
	
	public void putPiece(ChessPiece cp, Location loc) {
		if (loc.isValid()) {
			grid[loc.getRow()][loc.getCol()].setOccupant(cp);
		}
		else Log.e("ERROR", "Tried to place ChessPiece at invalid location:" + loc.getRow() + " " + loc.getCol());
	}
	
	/**
	 * @param loc
	 * @return true if the Location is occupied, false otherwise.
	 */
	public boolean isOccupied(Location loc) {
		return getPieceAt(loc) != null;
	}
	
	
	/**
	 * This method WILL RETURN NULL if x,y are not on the board.
	 * MAKE SURE you check for null values when using this method.
	 * @param x
	 * @param y
	 * @return ChessSquare containing the coords x,y
	 */
	public ChessSquare squareAtCoords(int x, int y) {
		for (ChessSquare[] row : grid) {
			for (ChessSquare cs : row) {
				if (cs.contains(x, y)) {
					return cs;
				}
			}
		}
		return null;
	}
	
	private void initPieces() {
		putPiece(new Rook(ChessPiece.BLACK, this), new Location(0,0));
		putPiece(new Knight(ChessPiece.BLACK, this), new Location(0,1));
		putPiece(new Bishop(ChessPiece.BLACK, this), new Location(0,2));
		putPiece(new Queen(ChessPiece.BLACK, this), new Location(0,3));
		putPiece(new King(ChessPiece.BLACK, this), new Location(0,4));
		putPiece(new Bishop(ChessPiece.BLACK, this), new Location(0,5));
		putPiece(new Knight(ChessPiece.BLACK, this), new Location(0,6));
		putPiece(new Rook(ChessPiece.BLACK, this), new Location(0,7));
		
		for (int x = 0; x < 8; x++) {
			putPiece(new Pawn(ChessPiece.BLACK, this), new Location(1,x));
		}

		putPiece(new Rook(ChessPiece.WHITE, this), new Location(7,0));
		putPiece(new Knight(ChessPiece.WHITE, this), new Location(7,1));
		putPiece(new Bishop(ChessPiece.WHITE, this), new Location(7,2));
		putPiece(new Queen(ChessPiece.WHITE, this), new Location(7,3));
		putPiece(new King(ChessPiece.WHITE, this), new Location(7,4));
		putPiece(new Bishop(ChessPiece.WHITE, this), new Location(7,5));
		putPiece(new Knight(ChessPiece.WHITE, this), new Location(7,6));
		putPiece(new Rook(ChessPiece.WHITE, this), new Location(7,7));
		
		for (int x = 0; x < 8; x++) {
			putPiece(new Pawn(ChessPiece.WHITE, this), new Location(6,x));
		}


	}
	
}
