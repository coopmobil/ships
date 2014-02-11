package org.coopmobil.ships;

public class FieldModel {

	private GameFieldCell[][] cellArray;
	private GameFieldMode mode;

	

	public FieldModel(GameFieldCell[][] gameField,GameFieldMode mode) {
		this.cellArray = gameField;
		this.mode = mode;
	}

	public GameFieldMode getMode() {
		return mode;
	}
	public int getGameFieldSize() {
		return cellArray.length;
	}
	/*public int[] getImageArray() {
		int columnCount = cellArray.length;
		int gameFieldCellCount = columnCount * columnCount;
		int[] imageArray = new int[gameFieldCellCount];
		
		int arrayIndex =-1;  
			for (int i = 0; i < columnCount; i++) {
				for (int j = 0; j < columnCount; j++) {
					arrayIndex++;
					imageArray[arrayIndex] = getCellImage(i,j);
				}
			}
		return imageArray;
	};*/
	/*public int getCellImage(int horizontalCoordinate,	int verticalCoordinate)
	{
		return cellArray[horizontalCoordinate][verticalCoordinate].getImmage();
	}*/
	public CellState getGameFieldCellState(int horizontalCoordinate,	int verticalCoordinate)
	{
		return cellArray[horizontalCoordinate][verticalCoordinate].getCellState();
	}
	public int getShipStateCount()
	{
		int shipCount = 0;
		for(int i=0;i < cellArray.length;i++ )
		{
			for(int j=0;j < cellArray.length;j++)
			{
				if(getGameFieldCellState(i,j) == CellState.SHIP)
					shipCount++;
			}
		}
		return shipCount;
	}
}
