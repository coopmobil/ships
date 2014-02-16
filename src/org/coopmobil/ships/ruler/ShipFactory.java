package org.coopmobil.ships.ruler;

import java.util.ArrayList;

import org.coopmobil.ships.gamefield.CellCoordinate;

public class ShipFactory 
{
	
	public Ship getShip(ArrayList<CellCoordinate> cells)
	{
		Ship ship = null;
		Ship shipTemp = null;
		
		int cellCount = cells.size();
		switch(cellCount)
		{
		case 1:
			shipTemp = new OneMaster();
			break;
		case 2:
			shipTemp = new TwoMaster();
			break;
		case 3:
			shipTemp = new ThreeMaster();
			break;
		case 4:
			shipTemp = new FourMaster();
			break;
		}
		if (shipTemp.isShipOfMyKind(cells))
		{
			ship = shipTemp;
		}
		return ship;
	}

}
