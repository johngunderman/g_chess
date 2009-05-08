package org.gChess;

import java.util.ArrayList;

//The Kinght must move/attack by moving two squares in any horizontal or vertical fashion followed by one square to the left or right thus making an L shape
//the knight is the only piece that is able to move/attack regardless of pieces in its way.

public class Knight extends ChessPiece {

	public Knight(int color, ChessBoard cb) {
		super(color,cb);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		// TODO Auto-generated method stub
		return null;
	}

}
