package org.gChess;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.shapes.RectShape;

public class ChessSquare {

	private Rect rect;
	private ChessPiece occupant;
	private Paint paint;
	
	public ChessSquare(Location loc) {
		occupant = null;
		
		//even row odd column, odd row even column
		if ((loc.getRow() + loc.getCol()) % 2 != 0) {
			paint = ChessView.GREEN;
		}
		//even even and odd odd.
		else paint = ChessView.CYAN;
	}
	
	public void setOccupant(ChessPiece cp) {
		occupant = cp;
	}
	
	public ChessPiece getOccupant() {
		return occupant;
	}
	
	public void render(Canvas canvas) {
		canvas.drawRect(rect, paint);
	}

	public void setSize(int squareLength, int squareHeight, Location loc) {
		int left   = loc.getCol() * squareLength;
		int top    = loc.getRow() * squareHeight;
		int right  = left + squareLength;
		int bottom = top + squareHeight;
		rect = new Rect(left, top, right, bottom);
	}
	
}
