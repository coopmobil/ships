package org.coopmobil.ships.ruler;

import java.util.ArrayList;

import org.coopmobil.ships.gamefield.CellCoordinate;

public class FourMaster extends RealShip {

	
	public FourMaster()
	{
		cellCoordinates = new ArrayList<CellCoordinate>();
		cellCoordinates.add(new CellCoordinate());
		cellCoordinates.add(new CellCoordinate());
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
		cellCoordinates.add(new CellCoordinate(startCell.getHorizontalCoordinate(),startCell.getVerticalCoordinate() + 2));
		cellCoordinates.add(new CellCoordinate(startCell.getHorizontalCoordinate(),startCell.getVerticalCoordinate() + 3));
		relativeCellCoordinates.add(cellCoordinates);
		cellCoordinates = new ArrayList<CellCoordinate>();
		cellCoordinates.add(new CellCoordinate(startCell.getHorizontalCoordinate(),startCell.getVerticalCoordinate()));
		cellCoordinates.add(new CellCoordinate(startCell.getHorizontalCoordinate() + 1,startCell.getVerticalCoordinate()));
		cellCoordinates.add(new CellCoordinate(startCell.getHorizontalCoordinate() + 2,startCell.getVerticalCoordinate()));
		cellCoordinates.add(new CellCoordinate(startCell.getHorizontalCoordinate() + 3,startCell.getVerticalCoordinate()));
		relativeCellCoordinates.add(cellCoordinates);
		return relativeCellCoordinates;
	}
	
	@Override
	public String getName(){
		return "Schlachtschiff";
	}
	
}
