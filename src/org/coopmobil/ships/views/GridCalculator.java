package org.coopmobil.ships.views;




public class GridCalculator {
	private static int c_FieldCount = 6; // Anzahl der Felder im Feld (später durch Config  gesetzt)
	
	public static int getFieldCount() { return c_FieldCount; }
//	public static int getFieldCountY() { return c_FieldCount; }

	
	
	private static int mFieldSizePixel; // Pixelgröße eines Feldes
	public static int getFieldSizePixel() {	return mFieldSizePixel;	}

	

	
	/**
	 *  Das Gitter ist Abhängig von 
	 *  a) der Auflösung der View und
	 *  b) von der Anzahl der Felder
	 */
	public static void calculate(int width, int height) {
			
		int sizeX = width / (c_FieldCount +1);
		int sizeY = height / (c_FieldCount +1);
		
		System.out.println("calculate -- width: " + width + " height: " + height);
		System.out.println("sizeX: " + sizeX + " sizeY: " + sizeY);
		
		mFieldSizePixel = Math.min(sizeX, sizeY); 
	}

}
