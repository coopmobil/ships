package org.coopmobil.ships.ruler.simple;

import java.util.ArrayList;
import java.util.List;

import org.coopmobil.ships.gamefield.GameField;
import org.coopmobil.ships.gamefield.GameFieldCell;
import org.coopmobil.ships.ruler.FourMaster;
import org.coopmobil.ships.ruler.OneMaster;
import org.coopmobil.ships.ruler.PlacementNotAllowed;
import org.coopmobil.ships.ruler.PlacementRuler;
import org.coopmobil.ships.ruler.Ship;
import org.coopmobil.ships.ruler.ThreeMaster;
import org.coopmobil.ships.ruler.TwoMaster;

public class PlacementRulerSimple implements PlacementRuler {

	int gameFieldSize = 10;
	int oneMasterMaxCount = 4;
	int twoMasterMaxCount = 3;
	int threeMasterMaxCount = 2;
	int fourMasterMaxCount = 1;

	private ArrayList<Ship> specifiedShipList;

	public PlacementRulerSimple() {
		specifiedShipList = new ArrayList<Ship>();
		for (int i = 0; i < oneMasterMaxCount; i++) {
			specifiedShipList.add(new OneMaster());
		}
		for (int i = 0; i < twoMasterMaxCount; i++) {
			specifiedShipList.add(new TwoMaster());
		}
		for (int i = 0; i < threeMasterMaxCount; i++) {
			specifiedShipList.add(new ThreeMaster());
		}
		for (int i = 0; i < fourMasterMaxCount; i++) {
			specifiedShipList.add(new FourMaster());
		}
	}

	@Override
	public boolean isPlacementPossible(ArrayList<Ship> ships) {
		boolean allowed = true;
		int oneMasterCount = 0;
		int twoMasterCount = 0;
		int threeMasterCount = 0;
		int fourMasterCount = 0;

		if (ships.size() > specifiedShipList.size())
			allowed = false;
		for (Ship ship : ships) {
			if (ship.getClass().isInstance(OneMaster.class)) {
				oneMasterCount++;
			} else if (ship.getClass().isInstance(TwoMaster.class)) {
				twoMasterCount++;
			} else if (ship.getClass().isInstance(ThreeMaster.class)) {
				threeMasterCount++;
			} else if (ship.getClass().isInstance(FourMaster.class)) {
				fourMasterCount++;
			}
		}
		if (oneMasterCount > oneMasterMaxCount
				||twoMasterCount > twoMasterMaxCount
				||threeMasterCount > threeMasterMaxCount
				||fourMasterCount > fourMasterMaxCount)
			allowed = false;
		return allowed;
	}

	@Override
	public GameField setShip(ArrayList<GameFieldCell> cells)
			throws PlacementNotAllowed {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Ship> getShipList() {
		return (ArrayList<Ship>) specifiedShipList.clone();
	}

	@Override
	public int getGameFieldSize() {
		return gameFieldSize;
	};
	
	// MPi neu
	@Override
	public int getBiggestShip(){
		// TODO Auto-generated method stub
		return new FourMaster().getOccupiedCells();		
	}

}
