package org.gChess;

import java.util.ArrayList;

public class Location {
	
	static public final int FORWARD = 0;
	static public final int FORWARD_RIGHT = 1;
	static public final int RIGHT = 2;
	static public final int BACK_RIGHT = 3;
	static public final int BACK = 4;
	static public final int BACK_LEFT = 5;
	static public final int LEFT = 6;
	static public final int FORWARD_LEFT = 7;
	
	static public final int DOWN = -1;
	static public final int UP = 1;
	
	
	private int col;
	private int row;
	
	/** Direction can be -1 or 1
	 * where -1 is facing a relative down
	 * and 1 is facing a relative up
	 * Use DOWN and UP.
	 */
	private int direction;
	
	public Location(int row, int col) {
		this.row = row;
		this.col = col;
		this.direction = 1;
	}

	public int getCol() {
		return col;
	}

	public int getRow() {
		return row;
	}
	
	public void setCol(int col){
		this.col = col;
	}
	
	public void setRow(int row){
		this.row = row;
	}
	
	/**
	 * @param loc
	 * @return true if <code>loc</code> is a valid location; false otherwise
	 */
	public boolean isValid() {
		if (getRow() < ChessBoard.ROWS 
				&& getCol() < ChessBoard.COLS
				&& getRow() >= 0
				&& getCol() >= 0 ) {
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
	
	
	public Location getLocationInDir(int dir){
		int row = getRow();
		int col = getCol();
		
		if (dir == FORWARD || dir == FORWARD_RIGHT || dir == FORWARD_LEFT) {
			row -= direction;
		}
		
		if (dir == FORWARD_RIGHT || dir == RIGHT || dir == BACK_RIGHT) {
			col += direction;
		}
		
		if (dir == BACK_RIGHT || dir == BACK || dir == BACK_LEFT) {
			row += direction;
		}
		
		if (dir == BACK_LEFT || dir == LEFT || dir == FORWARD_LEFT ){
			col -= direction;
		}
		
		return new Location(row, col);
	}
	
	public void setDirection(int dir) {
		direction = dir;
	}
	
	public String toString() {
		return "(" + getRow() + ", " + getCol() + ")";
	}
	
}
