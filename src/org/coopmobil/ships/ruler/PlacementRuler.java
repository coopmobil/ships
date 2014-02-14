package org.coopmobil.ships.ruler;

import java.util.List;

import org.coopmobil.ships.gamefield.Ship;
import org.coopmobil.ships.temp.*;

public interface PlacementRuler {
	public boolean isPlacementPossible(List<Ship> ships);
	public GameField setShip(List<GameFieldCell> cells)
	throws PlacementNotAllowed;
	
	
	public List<Ship> getLocalShips();
	
}
