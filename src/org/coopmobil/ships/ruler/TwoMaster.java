package org.coopmobil.ships.ruler;

import java.util.ArrayList;

import org.coopmobil.ships.gamefield.CellCoordinate;

public class TwoMaster extends RealShip {

	private ArrayList<CellCoordinate> cellCoordinates = null;
	
	public TwoMaster()
	{
		cellCoordinates = new ArrayList<CellCoordinate>();
		cellCoordinates.add(new CellCoordinate());
		cellCoordinates.add(new CellCoordinate());
	}
		

	@Override
	public ArrayList<ArrayList<CellCoordinate>> getRelativePosition(
			CellCoordinate startCell) {
		ArrayList<ArrayList<CellCoordinate>> relativeCellCoordinates = new ArrayList<ArrayList<CellCoordinate>>();
		ArrayList<CellCoordinate> cellCoordinates = new ArrayList<CellCoordinate>();
		cellCoordinates.add(new CellCoordinate(startCell.getHorizontalCoordinate(),startCell.getVerticalCoordinate()));
		cellCoordinates.add(new CellCoordinate(startCell.getHorizontalCoordinate(),startCell.getVerticalCoordinate() + 1));
		relativeCellCoordinates.add(cellCoordinates);
		cellCoordinates = new ArrayList<CellCoordinate>();
		cellCoordinates.add(new CellCoordinate(startCell.getHorizontalCoordinate(),startCell.getVerticalCoordinate()));
		cellCoordinates.add(new CellCoordinate(startCell.getHorizontalCoordinate() + 1,startCell.getVerticalCoordinate()));
		relativeCellCoordinates.add(cellCoordinates);
		return relativeCellCoordinates;
	}
	

}
