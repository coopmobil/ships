package org.coopmobil.ships;

import org.coopmobil.ships.views.GridCalculator;
import org.coopmobil.util.Dimension;



public class ShipField{
	
	private  Dimension size;
	
	private static ShipField instance;
	
	public static ShipField getInstance(){
		if(instance == null)
			instance = new ShipField(new Dimension(6, 7)); // ausgelesen aus Config ... z. B.
		
		return instance;
	}
	
	protected ShipField(Dimension size){
		this.size = size;
		GridCalculator.setFieldSize(size);
	}
 
	public Dimension getSize(){
		return size;
	}

	public String [][] getField(){
		String [] [] result = {
				{"0", "0", "0", "0", "0", "0"}, 
				{"0", "0", "0", "0", "0", "X"}, 
				{"0", "0", "0", "0", "0", "H"},
				{"0", "X", "X", "X", "0", "X"},
				{"0", "0", "0", "0", "0", "0"},
				{"0", "0", "0", "0", "0", "0"}};
		
		return result;
	}
}
