package org.coopmobil.ships;

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
