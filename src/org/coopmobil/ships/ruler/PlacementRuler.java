package org.coopmobil.ships.ruler;

import java.util.ArrayList;
import java.util.List;

import org.coopmobil.ships.gamefield.GameField;
import org.coopmobil.ships.gamefield.GameFieldCell;

public interface PlacementRuler {
	public boolean isPlacementPossible(ArrayList<Ship> ships);
	public GameField setShip(ArrayList<GameFieldCell> cells)
	throws PlacementNotAllowed;
	public int getGameFieldSize();
	public ArrayList<Ship> getShipList();
}
