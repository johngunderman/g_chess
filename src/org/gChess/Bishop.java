package org.gChess;

import java.util.ArrayList

//Bishop may move diagonally on their color in a straight line provided nothing obstructs their way.
// Bishops may attack the same way.

public class Bishop extends ChessPiece {

	public Bishop(int color, ChessBoard cb) {
		super(color,cb);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		// TODO Auto-generated method stub
		return null;
	}

}
