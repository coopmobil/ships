package org.coopmobil.ships.ruler;

import org.coopmobil.ships.gamefield.CellCoordinate;
import org.coopmobil.ships.gamefield.CellState;
import org.coopmobil.ships.util.GameStatus;

import java.util.UUID;

public interface BattleRuler {
	//List<player> -- ID, PlayField, 
	//spielType
	MoveRequest getNextMoveRequest();
	CellState checkResultForShot(UUID playerID, CellCoordinate cellCoordinate);
    GameStatus getGameStatus();
}
