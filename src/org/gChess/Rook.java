package org.gChess;

import java.util.ArrayList;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

//the rook may move or attack any distance in either a vertical or horizontal line
//see king for rules about rook castling

public class Rook extends ChessPiece {

	public Rook(int color, ChessBoard cb) {
		super(color,cb);
		if (getColor() == ChessPiece.BLACK) {
			image = new BitmapDrawable( 
					BitmapFactory.decodeResource(cb.getView().getResources(),
							R.drawable.black_rook)
						);
		}
		else if (getColor() == ChessPiece.WHITE) {
			image = new BitmapDrawable( 
					BitmapFactory.decodeResource(cb.getView().getResources(),
							R.drawable.white_rook)
					);
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> moves = new ArrayList<Location>();
		Location loc = getLoc();
		for (int index=0; index < 8; index++)
		{
			if ( loc.getSpaceInDir(getLoc(), 0).isValid() ){
				moves.add(loc.getSpaceInDir(getLoc(), 0));
			}
			loc = loc.getSpaceInDir(getLoc(), 0);
		}
		for (int index=0; index < 8; index++)
		{
			if ( loc.getSpaceInDir(getLoc(), 2).isValid() ){
				moves.add(loc.getSpaceInDir(getLoc(), 2));
			}
			loc = loc.getSpaceInDir(getLoc(), 2);
		}
		for (int index=0; index < 8; index++)
		{
			if ( loc.getSpaceInDir(getLoc(), 4).isValid() ){
				moves.add(loc.getSpaceInDir(getLoc(), 4));
			}
			loc = loc.getSpaceInDir(getLoc(), 4);
		}
		for (int index=0; index < 8; index++)
		{
			if ( loc.getSpaceInDir(getLoc(), 6).isValid() ){
				moves.add(loc.getSpaceInDir(getLoc(), 6));
			}
			loc = loc.getSpaceInDir(getLoc(), 6);
		}
		return moves;
	}

}
