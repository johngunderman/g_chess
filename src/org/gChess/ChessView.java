package org.gChess;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;

/**
 * ChessView says "I wanna put your stuff on the screen,
 * and I know how do do it." I say, great. So, ChessView,
 * would you please put my stuff on the screen? Oh, and I
 * also would like some of your fantastic functions
 * that make it easy to dump my grid into and in return
 * get a nice, formatted display. Thank you for chess boards.
 * I really do appreciate it.
 */
public class ChessView extends View {
	
	//Watch out, b/c these babies are
	//only accessible after the ChessView
	//class has been instantiated
	protected static Paint GREEN;
	protected static Paint CYAN;
	
	private Paint textPaint;
	private ChessBoard cb;
	
	private Integer height;
	private Integer width;
	
	public ChessView(Context context) {
		super(context);
		
		CYAN = new Paint();
		GREEN = new Paint();
		
		GREEN.setColor(Color.GREEN);
		CYAN.setColor(Color.CYAN);
		
		textPaint = new Paint();	
		textPaint.setColor(Color.BLACK);
		
		height = getHeight();
		width = getWidth();
		
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
		//TODO: This is just a little hack b/c the size of the window has not been
		// determined yet, since apparently we dont have focus yet.
		cb = new ChessBoard();
	}
	
	@Override
	public void onDraw(Canvas canvas) {
		canvas.drawColor(Color.WHITE);
		canvas.drawText("Hello World", 20, 20, textPaint);
		Rect r = new Rect(5,5,20,20);
		canvas.drawRect(r, GREEN);
		cb.render(canvas);
		
//        int w = canvas.getWidth();
//        int h = canvas.getHeight();
//        
//		canvas.drawRect(new Rect(), GREEN);
//		canvas.drawRect(5, 5, 20, 40, CYAN);
//		canvas.drawText("Hello World", 20, 20, textPaint);
	}
	
	/**
	 * get our changes and put 'em on the screen/canvas/thingy.
	 */
	private void update() {
		//TODO
	}
	
	/**
	 * I gots to get myself a new game, and this is how I'm gonna
	 * do it. I'm a man with a mission: to play chess.
	 */
	private void initNewGame() {
		//TODO
	}
}
