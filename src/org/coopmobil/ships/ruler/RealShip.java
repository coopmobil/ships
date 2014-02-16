package org.coopmobil.ships.ruler;

import java.util.ArrayList;

import org.coopmobil.ships.gamefield.CellCoordinate;

public class RealShip implements Ship {
	protected ArrayList<CellCoordinate> cellCoordinates = null;

	public void setCellCoordinates(ArrayList<CellCoordinate> newCellCoordinate)
	{
		ArrayList<CellCoordinate> newCoordinates = CellCoordinate.sortCellCoordinates(newCellCoordinate);
		for(int i = 0;i < cellCoordinates.size();i++)
		{
			cellCoordinates.set(i, newCoordinates.get(i));
		}
	}
	@Override
	public ArrayList<CellCoordinate> getPosition() {
		
		return cellCoordinates;
	}

	@Override
	public ArrayList<ArrayList<CellCoordinate>> getRelativePosition(
			CellCoordinate startCell) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getOccupiedCells() {
		return cellCoordinates.size();
	}

	@Override
	public boolean isShipOfMyKind(ArrayList<CellCoordinate> cells) {
		boolean shipOfMyKind = false;
		boolean shipOfMyKindTemp;
		ArrayList<CellCoordinate> sortedCells = CellCoordinate.sortCellCoordinates(cells);
		ArrayList<ArrayList<CellCoordinate>> relativeCoordinates = getRelativePosition(cells.get(0));
		for(ArrayList<CellCoordinate> offer:relativeCoordinates  )
		{
			shipOfMyKindTemp = true;
			for(int i= 0;i < offer.size();i++)
			{
				if(!offer.get(i).equals(sortedCells.get(i)))
				{
					shipOfMyKindTemp = false;
					break;
				}
				if (shipOfMyKindTemp == true)
				{
					shipOfMyKind = true;
					break;
				}
			}
		}
		return shipOfMyKind;
	}

}
