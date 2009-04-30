package org.gChess;

import android.graphics.Rect;

public class ChessSquare {

	private Rect rect;
	private ChessPiece occupant;
	
	public boolean setOccupant(ChessPiece cp) {
		if (occupant == null) {
			occupant = cp;
			return true;
		}
		else return false;
	}
	
}
