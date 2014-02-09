package org.coopmobil.ships.views;

import org.coopmobil.ships.ShipField;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


public class ShipFieldView extends android.view.View {
	
	private Paint mPaint;
	private Canvas mCanvas;
	private ShipField mShipFieldInstance = null;

	public ShipFieldView(Context c) {
		super(c);
		
		mPaint = new Paint();
	
		mPaint.setStrokeWidth(5); 
		mPaint.setColor(Color.BLUE);
		
		mShipFieldInstance = ShipField.getInstance(); // setzt im Zweifel die Größe des Feldes
		
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
    
	//Gittergröße neu berechnen
	GridCalculator.calculate(this.getWidth(), this.getHeight());
    
    mCanvas = canvas;
    String [][] field = mShipFieldInstance.getField(); // noch Dummywerte ...
    
    drawGrid();
    }
  
/*
 * todo ... 
 * - Breite bzw. höhe der Activity bestimmen (kleinster Wert) darauf Rand, Feld, ..., Feld, Rand verteilen
 * - Activity ohne Titelleiste (/)
 * -- aber dafür Buttons rechst bzw. unten. 
 * - Buchstaben bzw. Zahlen auf den Rand
 * - DrawGrid greift auf GridDistances / GridCalculator zu (/)
 */


  private void drawGrid() {
		int offSet = GridCalculator.getBorderPixel();
		int interSpace = GridCalculator.getInterspacePixel();
		
		int maxX = GridCalculator.getFieldSize().width;
		int maxY = GridCalculator.getFieldSize().height;
		

	    for(int y=0; y < maxY + 1; y++){ 
		    for(int x=0; x < maxX + 1; x++)
		          mCanvas.drawLine(offSet + x * interSpace, offSet, offSet + x * interSpace, offSet + maxY * interSpace, mPaint);  
		    
	        mCanvas.drawLine(offSet, offSet + y * interSpace, offSet + maxX * interSpace, offSet + y * interSpace, mPaint); 
	    }
	    
	    // Kreuz malen
	    mPaint.setColor(Color.GREEN);
	    mCanvas.drawLine(offSet + 5, offSet + 5 , offSet + interSpace - 5, offSet + interSpace - 5, mPaint); 	
	    mCanvas.drawLine(offSet + interSpace - 5, offSet + 5, offSet + 5, offSet + interSpace - 5, mPaint); 
	    
  }

}
