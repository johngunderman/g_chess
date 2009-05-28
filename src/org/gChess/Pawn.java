package org.gChess;

import java.util.ArrayList;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

//Pawn moves 1 space forward. During Pawn's first move it my instead move two if both spaces are open
//Pawn attacks to the forward diagonals one square ahead.
//When Pawn reaches farthest row it is promoted to any other piece the player selects besides king
//If a pawn is on the fifth row and an opponents pawn uses its two space move ending up directly adjacent to it, in the immediate following turn the pawn may attack as normal ending up behind the pawn as if the pawn had only moved one. this results in the capture of the pawn. This move is called En passant.

public class Pawn extends ChessPiece {

	public Pawn(int color, Location loc, ChessBoard cb) {
		super(color, loc, cb);
		if (getColor() == ChessPiece.BLACK) {
			loadImage(R.drawable.black_pawn);
		}
		else if (getColor() == ChessPiece.WHITE) {
			loadImage(R.drawable.white_pawn);
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> moves = new ArrayList<Location>();
		Location loc = getLoc();
		if (getColor() == ChessPiece.WHITE){
			loc = loc.getLocationInDir(Location.FORWARD);
			if (getBoard().getPieceAt(loc) == null){
				moves.add(loc);
			}
			if (getBoard().getPieceAt(loc.getLocationInDir(Location.FORWARD_RIGHT)) != null){
				moves.add(loc.getLocationInDir(Location.RIGHT));
			}
			if (getBoard().getPieceAt(loc.getLocationInDir(Location.FORWARD_LEFT)) != null){
				moves.add(loc.getLocationInDir(Location.LEFT));
			}
		}
		else {
			loc = loc.getLocationInDir(Location.BACK);
			if (getBoard().getPieceAt(loc) == null){
				moves.add(loc);
			}
			if (getBoard().getPieceAt(loc.getLocationInDir(Location.BACK_RIGHT)) != null){
				moves.add(loc.getLocationInDir(Location.RIGHT));
			}
			if (getBoard().getPieceAt(loc.getLocationInDir(Location.BACK_LEFT)) != null){
				moves.add(loc.getLocationInDir(Location.LEFT));
			}
		}
		return moves;
	}
	

}
