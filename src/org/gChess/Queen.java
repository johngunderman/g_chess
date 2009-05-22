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
		ArrayList<Location> moves = new ArrayList<Location>();
		Location loc = getLoc();
		for (int index =0; index < 8; index++){
			for (int ctr = 0; ctr < 8; ctr++){
				if(loc.getSpaceInDir(loc, index).isValid() ){
					moves.add( loc.getSpaceInDir(loc, index) );
				}
				loc = loc.getSpaceInDir(loc, index);
			}
			loc = getLoc();
		}
		return null;
	}

}
