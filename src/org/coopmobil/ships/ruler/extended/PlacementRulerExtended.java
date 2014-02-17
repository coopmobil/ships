package org.coopmobil.ships.ruler.extended;

import java.util.ArrayList;

import org.coopmobil.ships.gamefield.GameField;
import org.coopmobil.ships.gamefield.GameFieldCell;
import org.coopmobil.ships.ruler.PlacementNotAllowed;
import org.coopmobil.ships.ruler.PlacementRuler;
import org.coopmobil.ships.ruler.Ship;

public class PlacementRulerExtended implements PlacementRuler {

	@Override
	public boolean isPlacementPossible(ArrayList<Ship> ships) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GameField setShip(ArrayList<GameFieldCell> cells)
			throws PlacementNotAllowed {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public int getGameFieldSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Ship> getShipList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// MPi neu
	@Override
	public int getBiggestShip(){
		// TODO Auto-generated method stub
		return 0;		
	}
}
