package org.coopmobil.ships.gamefield;

import java.util.ArrayList;

public class CellCoordinate {
	private int horizontalCoordinate;
	private int verticalCoordinate;
	
	public static ArrayList<CellCoordinate> sortCellCoordinates(ArrayList<CellCoordinate> cells)
	{
		return null;
	}
	public CellCoordinate()
	{
		this(-1,-1);
	}
	public CellCoordinate(int horizontalCoordinate ,int verticalCoordinate)
	{
		this.horizontalCoordinate = horizontalCoordinate;
		this.verticalCoordinate = verticalCoordinate;
	};
	public int getHorizontalCoordinate() {
		return horizontalCoordinate;
	}
	public void setHorizontalCoordinate(int horizontalCoordinate) {
		this.horizontalCoordinate = horizontalCoordinate;
	}
	public int getVerticalCoordinate() {
		return verticalCoordinate;
	}
	public void setVerticalCoordinate(int verticalCoordinate) {
		this.verticalCoordinate = verticalCoordinate;
	}

}
