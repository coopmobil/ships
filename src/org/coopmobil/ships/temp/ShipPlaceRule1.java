package org.coopmobil.ships.temp;

import org.coopmobil.ships.gamefield.CellState;
import org.coopmobil.ships.gamefield.GameFieldMode;
import org.coopmobil.ships.ruler.Rule;

public class ShipPlaceRule1 implements Rule {

	int maxShipCount = 2;
	String ShipType ="Type1";
	int	type1Coutn =2;
	private void Type1Rule(int horizpntalCoordinate){
		
	}
	@Override
	public CellState getStateAfteClick(int horizontalCoordinate,
			int verticalCoordinate, FieldModel fieldModel)
			throws ClickNotAllowedException {
		CellState cellState = null;
		if (fieldModel.getMode() == GameFieldMode.SHIP_PLACING) 
		{
			cellState = (fieldModel.getGameFieldCellState(horizontalCoordinate, verticalCoordinate) 
					== CellState.EMPTY?CellState.SHIP:CellState.EMPTY);
			if (cellState == CellState.SHIP)
				checkShipPlacement(cellState,fieldModel);
		}
		return cellState;
	}
	private void checkShipPlacement(CellState cellState, FieldModel fieldModel)
	throws ClickNotAllowedException
	{
		int shipCount = fieldModel.getShipStateCount() 
				+ (cellState == CellState.SHIP?1:0);
		if(shipCount > this.maxShipCount)
			throw new ClickNotAllowedException();
	}

}
