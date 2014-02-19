package org.coopmobil.ships.ruler.extended;

import org.coopmobil.ships.gamefield.CellCoordinate;
import org.coopmobil.ships.gamefield.CellState;
import org.coopmobil.ships.ruler.BattleRuler;
import org.coopmobil.ships.ruler.MoveRequest;
import org.coopmobil.ships.util.GameStatus;

import java.util.UUID;

public class BattleRulerExtended implements BattleRuler {

	@Override
	public MoveRequest getNextMoveRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CellState checkResultForShot(UUID playerID, CellCoordinate cellCoordinate) {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public GameStatus getGameStatus() {
        return null;
    }

}
