package org.coopmobil.ships.ruler;

import java.util.ArrayList;

import org.coopmobil.ships.gamefield.CellCoordinate;

public interface Ship {
	public ArrayList<CellCoordinate> getPosition();
	public ArrayList<ArrayList<CellCoordinate>> getRelativePosition(CellCoordinate startCell);
	public int getOccupiedCells();
	public  boolean isShipOfMyKind(ArrayList<CellCoordinate> cells);
	public String getName();
}
