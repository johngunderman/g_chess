package org.gChess;

import java.util.ArrayList;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

//the rook may move or attack any distance in either a vertical or horizontal line
//see king for rules about rook castling

public class Rook extends ChessPiece {

	public Rook(int color, Location loc, ChessBoard cb) {
		super(color, loc, cb);
		if (getColor() == ChessPiece.BLACK) {
			loadImage(R.drawable.black_rook);
		}
		else if (getColor() == ChessPiece.WHITE) {
			loadImage(R.drawable.white_rook);
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> moves = new ArrayList<Location>();
		Location loc = getLoc();
		for (int index=0; index < 8; index++)
		{
			if ( loc.getLocationInDir(Location.FORWARD).isValid() ){
				moves.add(loc.getLocationInDir(Location.FORWARD));
			}
			loc = loc.getLocationInDir(Location.FORWARD);
		}
		for (int index=0; index < 8; index++)
		{
			if ( loc.getLocationInDir(Location.RIGHT).isValid() ){
				moves.add(loc.getLocationInDir(Location.RIGHT));
			}
			loc = loc.getLocationInDir(Location.RIGHT);
		}
		for (int index=0; index < 8; index++)
		{
			if ( loc.getLocationInDir(Location.BACK).isValid() ){
				moves.add(loc.getLocationInDir(Location.BACK));
			}
			loc = loc.getLocationInDir(Location.BACK);
		}
		for (int index=0; index < 8; index++)
		{
			if ( loc.getLocationInDir(Location.LEFT).isValid() ){
				moves.add(loc.getLocationInDir(Location.LEFT));
			}
			loc = loc.getLocationInDir(Location.LEFT);
		}
		return moves;
	}
	
	@Override
	public ArrayList<Location> getValidMoveLocations() {
		ArrayList<Location> locs = new ArrayList<Location>();
		
		ArrayList<Location> temp;
		
		temp = getBoard().locsInDirUntilBlocked(getLoc(), 
				Location.FORWARD, 
				getColor());
		locs.addAll(temp);
		
		temp = getBoard().locsInDirUntilBlocked(getLoc(), 
				Location.BACK, 
				getColor());
		locs.addAll(temp);
		
		temp = getBoard().locsInDirUntilBlocked(getLoc(), 
				Location.RIGHT, 
				getColor());
		locs.addAll(temp);
		
		temp = getBoard().locsInDirUntilBlocked(getLoc(), 
				Location.LEFT, 
				getColor());
		locs.addAll(temp);
		
		return locs;
	}

}
