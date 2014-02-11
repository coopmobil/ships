package org.coopmobil.ships;

public class GameFieldCell {
	private CellState cellState = CellState.EMPTY;
	
	public CellState getCellState() {
		return cellState;
	}

	public void setCellState(CellState cellState) {
		this.cellState = cellState;
	}

/*	public int getImmage()
	{
		int imageInd;
		if (cellState == CellState.EXPLODED_SHIP) {
			imageInd = R.drawable.explosion;
		} else if (cellState == CellState.SHIP) {
			imageInd = R.drawable.ship;
		} else {
			imageInd = R.drawable.see;
		}
		return imageInd;
	}*/
	

}
