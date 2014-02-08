package org.coopmobil.ships;

public interface Rule {
	public CellState getStateAfteClick(int horizontalCoordinate,int verticalCoordinate,FieldModel fieldModel)
	throws ClickNotAllowedException;
	
}
