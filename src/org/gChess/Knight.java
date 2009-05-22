package org.gChess;

import java.util.ArrayList;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

//The Kinght must move/attack by moving two squares in any horizontal or vertical fashion followed by one square to the left or right thus making an L shape
//the knight is the only piece that is able to move/attack regardless of pieces in its way.

public class Knight extends ChessPiece {

	public Knight(int color, Location loc, ChessBoard cb) {
		super(color, loc, cb);
		if (getColor() == ChessPiece.BLACK) {
			loadImage(R.drawable.black_knight);
		}
		else if (getColor() == ChessPiece.WHITE) {
			loadImage(R.drawable.white_knight);
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> moves = new ArrayList<Location>();
		Location loc = getLoc();
		loc = loc.getLocationInDir(Location.FORWARD).getLocationInDir(Location.FORWARD);
		moves.add(loc.getLocationInDir(Location.RIGHT));
		moves.add(loc.getLocationInDir(Location.LEFT));
		loc = getLoc();
		loc = loc.getLocationInDir(Location.RIGHT).getLocationInDir(Location.RIGHT);
		moves.add(loc.getLocationInDir(Location.FORWARD));
		moves.add(loc.getLocationInDir(Location.BACK));
		loc = getLoc();
		loc = loc.getLocationInDir(Location.LEFT).getLocationInDir(Location.LEFT);
		moves.add(loc.getLocationInDir(Location.FORWARD));
		moves.add(loc.getLocationInDir(Location.BACK));
		loc = getLoc();
		loc = loc.getLocationInDir(Location.BACK).getLocationInDir(Location.BACK);
		moves.add(loc.getLocationInDir(Location.RIGHT));
		moves.add(loc.getLocationInDir(Location.LEFT));
		
		
		return moves;
	}
}
