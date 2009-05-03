package org.gChess;

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
	
	public boolean equals(Location other) {
		if (other.getCol() == getCol()
				&& other.getRow() == getRow()) {
			return true;
		}
		else return false;
	}
}
