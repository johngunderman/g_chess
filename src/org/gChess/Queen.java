package org.gChess;

import java.util.ArrayList;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

//Queen may attack any direction in a straight line provided nothing else blocks her path.

public class Queen extends ChessPiece {

	public Queen(int color, ChessBoard cb) {
		super(color, cb);
		if (getColor() == ChessPiece.BLACK) {
			image = new BitmapDrawable( 
					BitmapFactory.decodeResource(cb.getView().getResources(),
							R.drawable.black_queen)
						);
		}
		else if (getColor() == ChessPiece.WHITE) {
			image = new BitmapDrawable( 
					BitmapFactory.decodeResource(cb.getView().getResources(),
							R.drawable.white_queen)
					);
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		// TODO Auto-generated method stub
		return null;
	}

}
