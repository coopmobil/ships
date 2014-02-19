package org.coopmobil.ships.views;

import org.coopmobil.ships.util.Dimension;

public class GridCalculator {
	
	//private static int mWidth = 0; 
	//private static int mHeight = 0;
	private static int mBorderPixel; // Pixel am Rand
	public static int getBorderPixel() {	return mBorderPixel;	}

	private static int mInterspacePixel; // Pixel Abstand
	public static int getInterspacePixel() {	return mInterspacePixel;	}
	
	private static Dimension mFieldSize; // Anzahl der Felder im Feld (durch Config oder ShipField gesetzt)
	public static Dimension getFieldSize() {	return  mFieldSize;	}
	public static void setFieldSize(Dimension size) {	mFieldSize = size;	}
	
	/**
	 *  Das Gitter ist Abhï¿½ngig von 
	 *  a) der Auflï¿½sung der View und
	 *  b) von der Anzahl der Felder
	 */
	public static void calculate(int width, int height) {
			
		int interSpaceX = width / (mFieldSize.width + 1);
	    int interSpaceY;
	    
	    if(height > width)
	    	interSpaceY = height / (mFieldSize.height + 1 + 5); //5 für die Textzeilen (noch Festwert)
	    else
	    	interSpaceY = height / (mFieldSize.height + 1);
		
		System.out.println("calculate -- width: " + width + " height: " + height);
		System.out.println("interSpaceX: " + interSpaceX + " interSpaceY: " + interSpaceY);
		
		mInterspacePixel = Math.min(interSpaceX, interSpaceY); 
		mBorderPixel = mInterspacePixel / 2;
	}

}
