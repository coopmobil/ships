package org.coopmobil.ships.views;

import org.coopmobil.ships.temp.ShipField;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;


public class ShipFieldView extends android.view.View {
	
	private Paint mGridPaint;
	private Paint mTextPaint;
	private Canvas mCanvas;
	private ShipField mShipFieldInstance = null;
	
	private static String [] letterArra = {"", "A","B", "C", "D", "E", "F", "G", "H", "I"}; // mehr für größere Felder (maximal 9 x 9)

	private void init() {
		mGridPaint = new Paint();
		 
		mGridPaint.setColor(Color.BLUE);
		
		mTextPaint = new Paint();
		mTextPaint.setColor(Color.BLACK);
		
		mShipFieldInstance = ShipField.getInstance(); // setzt im Zweifel die Größe des Feldes
	}
	
	public ShipFieldView(Context c, AttributeSet attr) {
		super(c, attr);

		init();	
	}

	public ShipFieldView(Context c) {
		this(c, null);
	}
	
    @Override
    protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    
	//Gittergröße neu berechnen
	GridCalculator.calculate(this.getWidth(), this.getHeight());
    
	mGridPaint.setStrokeWidth(GridCalculator.getBorderPixel() / 8);
	mTextPaint.setTextSize(Math.round(GridCalculator.getBorderPixel() * 0.9));
	
    mCanvas = canvas;
    String [][] field = mShipFieldInstance.getField(); // noch Dummywerte ...
    
    drawGrid();
    }

  private void drawGrid() {
		int offSet = GridCalculator.getBorderPixel();
		int interSpace = GridCalculator.getInterspacePixel();
		
		int maxX = GridCalculator.getFieldSize().width;
		int maxY = GridCalculator.getFieldSize().height;
		

	    for(int y=0; y < maxY + 1; y++){ 
		    for(int x=0; x < maxX + 1; x++){
		          mCanvas.drawLine(offSet + x * interSpace, offSet, offSet + x * interSpace, offSet + maxY * interSpace, mGridPaint);  
		          if(y == 0 && x != 0)
		        	  mCanvas.drawText(Integer.toString(x), x * interSpace, Math.round(0.7 * offSet), mTextPaint);
		        	  
		    }
		    
	        mCanvas.drawLine(offSet, offSet + y * interSpace, offSet + maxX * interSpace, offSet + y * interSpace, mGridPaint); 
        	mCanvas.drawText(letterArra[y], Math.round(0.3 * offSet) , y * interSpace, mTextPaint);

	    }
	    
	    // Kreuz malen
	    mGridPaint.setColor(Color.GREEN);
	    mCanvas.drawLine(offSet + 5, offSet + 5 , offSet + interSpace - 5, offSet + interSpace - 5, mGridPaint); 	
	    mCanvas.drawLine(offSet + interSpace - 5, offSet + 5, offSet + 5, offSet + interSpace - 5, mGridPaint); 
	    
  }

}
