package org.coopmobil.ships.temp;

import org.coopmobil.ships.gamefield.CellState;

public interface Rule {
	public CellState getStateAfteClick(int horizontalCoordinate,int verticalCoordinate,FieldModel fieldModel)
	throws ClickNotAllowedException;
	
}
