package org.gChess;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;

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

	private Paint textPaint;
	private Paint purplePaint;
	private Paint pinkPaint;
	private ChessBoard cb;
	
	public ChessView(Context context) {
		super(context);
		
		textPaint = new Paint();
		purplePaint = new Paint();
		pinkPaint = new Paint();
		
		textPaint.setARGB(0,0,0,0);
		purplePaint.setARGB(0, 230, 0, 230);
		pinkPaint.setARGB(0, 100, 0, 0);
		
		cb = new ChessBoard(getWidth(), getHeight());
	}
	
	@Override
	public void onDraw(Canvas canvas) {
		canvas.drawText("Hello World", 20, 20, textPaint);
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
