package org.coopmobil.ships.ruler;

import org.coopmobil.ships.gamefield.CellState;
import org.coopmobil.ships.temp.ClickNotAllowedException;
import org.coopmobil.ships.temp.FieldModel;

public interface Rule {
	public CellState getStateAfteClick(int horizontalCoordinate,int verticalCoordinate,FieldModel fieldModel)
	throws ClickNotAllowedException;
	
}
