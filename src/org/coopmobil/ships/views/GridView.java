package org.coopmobil.ships.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class GridView extends android.view.View {
	
	private Paint mPaint;

	public GridView(Context c) {
		super(c);
		// TODO Auto-generated constructor stub
		
		
		mPaint = new Paint();
	    
	
		mPaint.setStrokeWidth(5); 
		mPaint.setColor(Color.BLUE);
		
	/*
	    mPaint.setAntiAlias(true);
	    mPaint.setDither(true);

	    mPaint.setStyle(Paint.Style.STROKE);
	    mPaint.setStrokeJoin(Paint.Join.ROUND);
	    mPaint.setStrokeCap(Paint.Cap.ROUND);
	  
	    */
		
	}
	
    @Override
    protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    canvas.drawLine(110, 120, 250, 360, mPaint);
   


    }

}
