package org.coopmobil.ships.ruler;

import org.coopmobil.ships.gamefield.CellCoordinate;
import org.coopmobil.ships.gamefield.CellState;

public interface BattleRuler {
	//List<player> -- ID, PlayField, 
	//spielType
	public Move getNextMove();
	public CellState doShot(int playerID,CellCoordinate cellCoordinate );

}
