package org.gChess;

import java.util.ArrayList;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

//Queen may attack any direction in a straight line provided nothing else blocks her path.

public class Queen extends ChessPiece {

	public Queen(int color, Location loc, ChessBoard cb) {
		super(color, loc, cb);
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
				if(loc.getLocationInDir(index).isValid() ){
					moves.add( loc.getLocationInDir(index) );
				}
				loc = loc.getLocationInDir(index);
			}
			loc = getLoc();
		}
		return null;
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
