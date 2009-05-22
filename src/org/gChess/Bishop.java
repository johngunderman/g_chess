package org.gChess;

import java.util.ArrayList;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;

//Bishop may move diagonally on their color in a straight line provided nothing obstructs their way.
// Bishops may attack the same way.

public class Bishop extends ChessPiece {

	public Bishop(int color, ChessBoard cb) {
		super(color,cb);
		if (getColor() == ChessPiece.BLACK) {
			loadImage(R.drawable.black_bishop);
		}
		else if (getColor() == ChessPiece.WHITE) {
			loadImage(R.drawable.white_bishop);
		}
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> moves = new ArrayList<Location>();
		Location loc = getLoc();
		for (int index = 1; index < 8; index = index + 2){
			for(int ctr = 0; ctr < 8 ; ctr++){
				if(loc.getSpaceInDir(loc, index).isValid() ){
					moves.add( loc.getSpaceInDir(loc, index) );
				}
				loc = loc.getSpaceInDir(loc, index);
			}
			loc = getLoc();
		}
		return moves;
	}

}
