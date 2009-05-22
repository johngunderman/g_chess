package org.gChess;

import java.util.ArrayList;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

//Queen may attack any direction in a straight line provided nothing else blocks her path.

public class Queen extends ChessPiece {

	public Queen(int color, ChessBoard cb) {
		super(color, cb);
		if (getColor() == ChessPiece.BLACK) {
			loadImage(R.drawable.black_queen);
		}
		else if (getColor() == ChessPiece.WHITE) {
			loadImage(R.drawable.white_queen);
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		// TODO Auto-generated method stub
		return null;
	}

}
