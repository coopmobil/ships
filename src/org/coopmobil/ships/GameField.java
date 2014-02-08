package org.coopmobil.ships;

public class GameField  {
	private GameFieldCell [][] cellArray;
	private int gameFieldSize;
	private GameFieldMode mode;
		
	public int getGameFieldSize() {
		return gameFieldSize;
	}
	public void setGameFieldSize(int gameFieldSize) {
		this.gameFieldSize = gameFieldSize;
	}
	public GameFieldMode getMode() {
		return mode;
	}
	public void setMode(GameFieldMode mode) {
		this.mode = mode;
	}
	public GameField(int gameFieldSize)
	{
		this.gameFieldSize = gameFieldSize;
		cellArray = new GameFieldCell[this.gameFieldSize][this.gameFieldSize];
	}
	public GameFieldCell[][] getCellArray() {
		return cellArray;
	}

	public void setCellArray(GameFieldCell[][] cellArray) {
		this.cellArray = cellArray;
	}

	public FieldModel getFieldModel() {
		FieldModel fieldModel = new FieldModel(cellArray.clone());
		return fieldModel;
	}

		
	public void setNewCellState (int horizontalCoordinate,int verticalCoordinate,CellState newState)
	throws OverrunningException
	{
		if (horizontalCoordinate < 0 || horizontalCoordinate > gameFieldSize
		||verticalCoordinate < 0 ||verticalCoordinate > gameFieldSize) throw new OverrunningException();
		cellArray[horizontalCoordinate][verticalCoordinate].setCellState(newState);
	}

}
