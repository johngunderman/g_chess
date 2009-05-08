package org.gChess;

import java.util.ArrayList;

//the rook may move or attack any distance in either a vertical or horizontal line
//see king for rules about rook castling

public class Rook extends ChessPiece {

	public Rook(int color, ChessBoard cb) {
		super(color,cb);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		// TODO Auto-generated method stub
		return null;
	}

}
