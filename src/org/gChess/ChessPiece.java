package org.gChess;

import java.util.ArrayList;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PixelFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/** 
 * This class contains all the base methods for each chess piece
 */
public abstract class ChessPiece {

	/**
	 * apparently enums don't play to happily with limited cpu
	 * cycles, so these will have to take up the slack.
	 * These class vars are for determining the "team" aka color
	 * of a ChessPiece
	 */
	public final static int BLACK = 0;
	public final static int WHITE = 1;
	
	protected Drawable image;
	
	private ChessBoard cb;
	
	/**
	 * it is quite possible that this is the most pointless comment
	 * so far: the color variable records what color our ChessPiece is.
	 * Yipee.
	 */
	private int color;
	
	/** stores our current row,col. */
	private Location loc;
	
	
	public ChessPiece(int color, Location loc, ChessBoard cb) {
		this.cb = cb;
		this.loc = loc;
		switch (color) {
		case BLACK: {
			this.color = BLACK;
			break;
		}
		case WHITE: {
			this.color = WHITE;
			break;
		}
		default: {
			//TODO: get this off of runtime exception
			throw new RuntimeException("Cannot create a chess piece who's color is not black or white");
		}
		}            

	}
	
	
	/**
	 * return true if there are ANY valid locations we can move to; 
	 * returns false otherwise.
	 */
	public boolean canMove() {
		ArrayList<Location> locs = getValidMoveLocations();
		if (locs.size() == 0){
			return false;
		}
		else return true;
	}
	
	/**
	 * @return an ArrayList of Locations that we can move to
	 * and that are not occupied.
	 */
	public ArrayList<Location> getValidMoveLocations() {
		ArrayList<Location> locs = getMoveLocations();
		ArrayList<Location> returned = new ArrayList<Location>();
		for (Location loc : locs) {
			if (!cb.isOccupied(loc) && loc.isValid()) {
				returned.add(loc);
			}
			if (cb.isOccupied(loc)){
				if (cb.getPieceAt(loc).getColor() != getColor()){
					returned.add(loc);
				}
			}
		}
		return returned;
	}
	
	
	//TODO finish grid access and rules for moving pieces
	
	
	public void moveTo(Location loc) {
	
	cb.movePiece(this, loc);
	}
	
	/**
	 * This method DOES NOT check that all returned locations are not occupied.
	 * @return an ArrayList of Locations that this chess piece potentially
	 * could move to.
	 */
	abstract public ArrayList<Location> getMoveLocations();
	
	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public int getColor() {
		return color;
	}
	
	public Drawable getImage() {
		return image;
	}
	
	public void loadImage(int resource) {
		image = cb.getView().getResources().getDrawable(resource);
	}

	public ChessBoard getBoard(){
		return cb;
	}
	
	
}
