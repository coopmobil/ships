package org.coopmobil.ships.ruler;

import java.util.ArrayList;

import org.coopmobil.ships.gamefield.CellCoordinate;

public class OneMaster extends RealShip  {

	public OneMaster()
	{
		cellCoordinates = new ArrayList<CellCoordinate>();
		cellCoordinates.add(new CellCoordinate());
	}
	

	@Override
	public ArrayList<ArrayList<CellCoordinate>> getRelativePosition(
			CellCoordinate startCell) {
		ArrayList<ArrayList<CellCoordinate>> relativeCellCoordinates = new ArrayList<ArrayList<CellCoordinate>>();
		ArrayList<CellCoordinate> cellCoordinates = new ArrayList<CellCoordinate>();
		cellCoordinates.add(new CellCoordinate(startCell.getHorizontalCoordinate(),startCell.getVerticalCoordinate()));
		relativeCellCoordinates.add(cellCoordinates);
		return relativeCellCoordinates;
	}
	
	

}
