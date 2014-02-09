package org.coopmobil.ships.views;

import org.coopmobil.ships.ShipField;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


public class ShipFieldView extends android.view.View {
	
	private Paint mGridPaint;
	private Paint mTextPaint;
	private Canvas mCanvas;
	private ShipField mShipFieldInstance = null;
	
	private static String [] letterArra = {"", "A","B", "C", "D", "E", "F", "G", "H", "I"}; // mehr für größere Felder (maximal 9 x 9)

	public ShipFieldView(Context c) {
		super(c);
		
		mGridPaint = new Paint();
		mGridPaint.setStrokeWidth(5); 
		mGridPaint.setColor(Color.BLUE);
		
		mTextPaint = new Paint();
		mTextPaint.setColor(Color.BLACK);
		mTextPaint.setTextSize(30);
		
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
		    for(int x=0; x < maxX + 1; x++){
		          mCanvas.drawLine(offSet + x * interSpace, offSet, offSet + x * interSpace, offSet + maxY * interSpace, mGridPaint);  
		          if(y == 0 && x != 0)
		        	  mCanvas.drawText(Integer.toString(x), x * interSpace, Math.round(offSet / 1.5), mTextPaint);
		        	  
		    }
		    
	        mCanvas.drawLine(offSet, offSet + y * interSpace, offSet + maxX * interSpace, offSet + y * interSpace, mGridPaint); 
        	mCanvas.drawText(letterArra[y], Math.round(offSet / 2.5), y * interSpace, mTextPaint);

	    }
	    
	    // Kreuz malen
	    mGridPaint.setColor(Color.GREEN);
	    mCanvas.drawLine(offSet + 5, offSet + 5 , offSet + interSpace - 5, offSet + interSpace - 5, mGridPaint); 	
	    mCanvas.drawLine(offSet + interSpace - 5, offSet + 5, offSet + 5, offSet + interSpace - 5, mGridPaint); 
	    
  }

}
