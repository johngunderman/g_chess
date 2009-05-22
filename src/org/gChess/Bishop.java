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

	public Bishop(int color, Location loc, ChessBoard cb) {
		super(color, loc, cb);
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
		
		for (int index = 1; index < 8; index += 2) {
			Location nextLoc = loc.getLocationInDir(index);
			
			while (nextLoc.isValid()) {
				moves.add(loc.getLocationInDir(index));
				loc = nextLoc;
			}
		}
		return moves;
	}
	
	@Override
	public ArrayList<Location> getValidMoveLocations() {
		ArrayList<Location> locs = new ArrayList<Location>();
		
		ArrayList<Location> temp;
		
		temp = getBoard().locsInDirUntilBlocked(getLoc(), 
				Location.BACK_LEFT, 
				getColor());
		locs.addAll(temp);
		
		temp = getBoard().locsInDirUntilBlocked(getLoc(), 
				Location.BACK_RIGHT, 
				getColor());
		locs.addAll(temp);
		
		temp = getBoard().locsInDirUntilBlocked(getLoc(), 
				Location.FORWARD_LEFT, 
				getColor());
		locs.addAll(temp);
		
		temp = getBoard().locsInDirUntilBlocked(getLoc(), 
				Location.FORWARD_RIGHT, 
				getColor());
		locs.addAll(temp);
		
		return locs;
	}

}
