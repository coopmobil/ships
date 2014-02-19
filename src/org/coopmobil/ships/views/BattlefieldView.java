package org.coopmobil.ships.views;

import java.util.ArrayList;

import org.coopmobil.ships.util.GameType;
import org.coopmobil.ships.ruler.PlacementRuler;
import org.coopmobil.ships.ruler.PlacementRulerFactory;
import org.coopmobil.ships.ruler.Ship;
import org.coopmobil.ships.util.Dimension;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;


public class BattlefieldView extends android.view.View {
	
	private Paint mGridPaint;
	private Paint mTextPaint;
	private Canvas mCanvas;
	//private ShipField mShipFieldInstance = null;
	private PlacementRuler mPlacementRuler;
	
	private BattlefieldMode mode = BattlefieldMode.PLACEMENT;
	
	private static String [] letterArra = {"", "A","B", "C", "D", "E", "F", "G", "H", "I", "J"}; // mehr fï¿½r grï¿½ï¿½ere Felder (maximal 10 x 10)


    public BattlefieldMode getMode()	{	return mode;	}
    public void setMode(BattlefieldMode mode) { this.mode = mode; }
    
	private void init() {
		mGridPaint = new Paint();
		 
		mGridPaint.setColor(Color.BLUE);
		
		mTextPaint = new Paint();
		mTextPaint.setColor(Color.BLACK);
		
		mPlacementRuler = PlacementRulerFactory.getRuler(GameType.SIMPLE);
		GridCalculator.setFieldSize(new Dimension(mPlacementRuler.getGameFieldSize(), mPlacementRuler.getGameFieldSize()));
	//	mShipFieldInstance = ShipField.getInstance(); // setzt im Zweifel die Grï¿½ï¿½e des Feldes
	}
	
	public BattlefieldView(Context c, AttributeSet attr) {
		super(c, attr);

		init();	
	}

	public BattlefieldView(Context c) {
		this(c, null);
	}
	
    @Override
    protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    
	//Gittergrï¿½ï¿½e neu berechnen
  
	GridCalculator.calculate(this.getWidth(), this.getHeight());
    
	mGridPaint.setStrokeWidth(GridCalculator.getBorderPixel() / 8);
	mTextPaint.setTextSize(Math.round(GridCalculator.getBorderPixel() * 0.9));
	
    mCanvas = canvas;
    //String [][] field = mShipFieldInstance.getField(); // noch Dummywerte ...
    
    drawGrid();
    
    if(mode == BattlefieldMode.PLACEMENT)
    	drawAvailableShips();
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
	    // mGridPaint.setColor(Color.GREEN);
	    // mCanvas.drawLine(offSet + 5, offSet + 5 , offSet + interSpace - 5, offSet + interSpace - 5, mGridPaint); 	
	    // mCanvas.drawLine(offSet + interSpace - 5, offSet + 5, offSet + 5, offSet + interSpace - 5, mGridPaint); 
	    
   }
    
    private void drawAvailableShips() {
    	int xOffSet;
    	int yOffSet;
    	
    	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
    		xOffSet = GridCalculator.getInterspacePixel();
    		yOffSet = GridCalculator.getInterspacePixel() * (GridCalculator.getFieldSize().height + 1);
    	}
    	else{
      		xOffSet = GridCalculator.getInterspacePixel() * (GridCalculator.getFieldSize().width + 1);  		
      		yOffSet = GridCalculator.getInterspacePixel();
    	}
    	
    	mCanvas.drawText("noch mögliche Schiffe:", xOffSet, yOffSet, mTextPaint);
    	ArrayList<Ship> ships = mPlacementRuler.getShipList();
    	
    	for(int row = 0; row < mPlacementRuler.getBiggestShip(); row++){
    		int currentShipSize = 4 - row;
    	   	int currentShipCount = 0;
    	   	String currentShipName = "";
    		
    		for (int i = 0; i < ships.size(); i++)
    			if(ships.get(i).getOccupiedCells() == currentShipSize){
    				currentShipCount++;
    				currentShipName = ships.get(i).getName();
    			}
    				
    			
    		String shipText = Integer.toString(currentShipCount) + " * " + currentShipName;
    		
    		
    	 	mCanvas.drawText(shipText, xOffSet, yOffSet + (row + 1) * GridCalculator.getInterspacePixel(), mTextPaint); 		
    	}
    		
    }
}