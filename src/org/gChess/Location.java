package org.gChess;

import java.util.ArrayList;

public class Location {
	
	private int col;
	private int row;
	
	public Location(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public int getCol() {
		return col;
	}

	public int getRow() {
		return row;
	}
	
	/**
	 * @param loc
	 * @return true if <code>loc</code> is a valid location; false otherwise
	 */
	public boolean isValid(Location loc) {
		if (loc.getRow() < ChessBoard.ROWS 
				&& loc.getCol() < ChessBoard.COLS
				&& loc.getRow() > 0
				&& loc.getCol() > 0 ) {
			return true;
		}
		else return false;
	}
	
	public boolean equals(Location other) {
		if (other.getCol() == getCol()
				&& other.getRow() == getRow()) {
			return true;
		}
		else return false;
	}

	public boolean includedIn(ArrayList<Location> locs) {
		for (Location loc : locs) {
			if (loc.equals(this)) {
				return true;
			}
		}
		return false;
	}
	
	
}
