package org.coopmobil.ships.temp;

import org.coopmobil.ships.gamefield.CellState;
import org.coopmobil.ships.gamefield.GameField;

public interface Arbitrator {
	
	public FieldModel getOwnFieldModel();
	public FieldModel getEnemyFieldModel();
	
	public FieldModel doOwnFieldClick(int horizontalCoordinate,
			int verticalCoordinate) throws ClickNotAllowedException ;

	public CellState getOwnFieldClick(int horizontalCoordinate,
			int verticalCoordinate) throws ClickNotAllowedException ;

	public FieldModel doEnemyFieldClick(int horizontalCoordinate,
			int verticalCoordinate)
	throws ClickNotAllowedException ;
	
	public void setEnemyGameField(GameField enemyGameField);

}
