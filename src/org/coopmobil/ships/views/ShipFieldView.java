package org.coopmobil.ships.views;

import org.coopmobil.ships.ShipField;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


public class ShipFieldView extends android.view.View {
	
	private Paint mPaint;
	private Canvas mCanvas;

	public ShipFieldView(Context c) {
		super(c);
		
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
    
    mCanvas = canvas;
    String [][] field = ShipField.getInstance().getField(); // noch Dummywerte ...
    
    drawGrid();

 
/*
 * todo ... 
 * - Breite bzw. höhe der Activity bestimmen (kleinster Wert) darauf Rand, Feld, ..., Feld, Rand verteilen
 * - Activity ohne Titelleiste (/)
 * -- aber dafür Buttons rechst bzw. unten. 
 * - Buchstaben bzw. Zahlen auf den Rand
 * - DrawGrid greift auf GridDistances / GridCalculator zu (/)
 */
    

   


  }

  private void drawGrid() {
		int offSet = GridDistances.borderPixel;
		int interSpace = GridDistances.interspacePixel;
		
		int maxX = GridDistances.gridFieldCount.width;
		int maxY = GridDistances.gridFieldCount.height;
		

	    for(int y=0; y < maxY + 1; y++){ 
		    for(int x=0; x < maxX + 1; x++)
		          mCanvas.drawLine(offSet + x * interSpace, offSet, offSet + x * interSpace, offSet + maxY * interSpace, mPaint);  
		    
	        mCanvas.drawLine(offSet, offSet + y * interSpace, offSet + maxX * interSpace, offSet + y * interSpace, mPaint); 
	    }
	    	
		
  }

}
