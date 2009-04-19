package org.gChess;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Bundle;
import android.widget.ImageView;

public class gChess extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ChessView iv = new ChessView(this);
        setContentView(iv);
    }
}