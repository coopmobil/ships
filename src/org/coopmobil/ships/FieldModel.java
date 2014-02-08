package org.coopmobil.ships;

public class FieldModel {
	
	private GameFieldCell [][] cellArray;
	public FieldModel(GameFieldCell [][] gameField)
	{
		this.cellArray = gameField;
	}
	public GameFieldCell [][] getCellArray() {
		return cellArray;
	}
}
