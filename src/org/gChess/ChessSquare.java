package org.gChess;

import android.graphics.Rect;
import android.graphics.drawable.shapes.RectShape;

public class ChessSquare {

	private Rect rect;
	private RectShape rectShape;
	private ChessPiece occupant;
	
	public ChessSquare(int width, int height) {
		rectShape = new RectShape();
		rectShape.resize(width, height);
		occupant = null;
	}
	
	public void setOccupant(ChessPiece cp) {
		occupant = cp;
	}
	
	public ChessPiece getOccupant() {
		return occupant;
	}
	
}
