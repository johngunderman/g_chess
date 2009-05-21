package org.gChess;

import java.util.ArrayList;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

//Bishop may move diagonally on their color in a straight line provided nothing obstructs their way.
// Bishops may attack the same way.

public class Bishop extends ChessPiece {

	public Bishop(int color, ChessBoard cb) {
		super(color,cb);
		if (getColor() == ChessPiece.BLACK) {
			image = new BitmapDrawable( 
					BitmapFactory.decodeResource(cb.getView().getResources(),
							R.drawable.black_bishop)
						);
		}
		else if (getColor() == ChessPiece.WHITE) {
			image = new BitmapDrawable( 
					BitmapFactory.decodeResource(cb.getView().getResources(),
							R.drawable.white_bishop)
					);
		}
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		// TODO Auto-generated method stub
		return null;
	}

}
