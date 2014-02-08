package org.coopmobil.ships.views;

import org.coopmobil.ships.ShipField;

public class GridCalculator {
	
	private static int m_screenWidth = 0; 
	private static int m_screenHeight = 0;
	
	
	public static void init(int screenWidth, int screenHeight) {
		if(m_screenWidth == 0 || m_screenHeight == 0){
			m_screenWidth = screenWidth;
			m_screenHeight = screenHeight;	
			
		ShipField theShipField = ShipField.getInstance(); // setzt im Zweifel die Gr��e des Feldes
		/**
		 *  Das Gitter ist Abh�ngig von 
		 *  a) der Aufl�sung des Ger�tes und
		 *  b) von der Anzahl der Felder
		 */
	
			calculateGrid();
		}
	}

	private static void calculateGrid() {
			
		int interSpaceX = m_screenWidth / (GridDistances.gridFieldCount.width +1);
		int interSpaceY = m_screenHeight / (GridDistances.gridFieldCount.height +1);

		 GridDistances.interspacePixel = Math.min(interSpaceX, interSpaceY); 
		/*
		 * int smallesSide = Math.min (m_screenWidth, m_screenHeight);
		 int biggesDimension = Math.max(GridDistances.gridFieldCount.width, GridDistances.gridFieldCount.height);
		 
		 GridDistances.interspacePixel = smallesSide / (biggesDimension + 1);
		 
		 */
	
		 GridDistances.borderPixel = GridDistances.interspacePixel / 2;
	}
}
