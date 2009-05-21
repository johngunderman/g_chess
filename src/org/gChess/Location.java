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
	
	
	public Location getSpaceInDir(Location loc, int dir){
		Location space = new Location(loc.getRow(), loc.getCol());
		if (dir == 0 || dir == 1 || dir == 7)
		{
			space.setCol( space.getCol() + 1 );
		}
		if (dir == 1 || dir ==2 || dir ==3)
		{
			space.setRow( space.getRow() + 1 );
		}
		if (dir == 3 || dir == 4 || dir == 5)
		{
			space.setCol( space.getCol() - 1 );
		}
		if (dir == 5 || dir == 6 || dir == 7 )
		{
			space.setRow( space.getRow() - 1 );
		}
		
		return space;
	}
	
}
