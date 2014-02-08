package org.coopmobil.ships.views;

import org.coopmobil.ships.ShipField;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class ShipFieldView extends android.view.View {
	
	private Paint mPaint;

	public ShipFieldView(Context c) {
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

    for(int y=0; y < ShipField.size.height + 1; y++){ 
	    for(int x=0; x < ShipField.size.width + 1; x++)
	          canvas.drawLine(50 + x * 100, 50, 50 + x * 100, 50 + ShipField.size.height * 100, mPaint);    	
        canvas.drawLine(50, 50 + 100 * y, 50 + ShipField.size.width * 100, 50 + 100 * y, mPaint);    	
	    
    }
 
    //int y = ShipField.size.height; 
    

   


    }

}
