package org.coopmobil.ships.game.testhelper;

import org.coopmobil.ships.gamefield.CellCoordinate;
import org.coopmobil.ships.gamefield.CellState;
import org.coopmobil.ships.ruler.BattleRuler;
import org.coopmobil.ships.ruler.MoveRequest;
import org.coopmobil.ships.util.GameStatus;

import java.util.UUID;

/**
 * Created by Michael on 18.02.14.
 */
public class BattleRulerMock implements BattleRuler {
    int moveCount = 5;
    UUID playerId;

    public BattleRulerMock(UUID playerId) {
        this.playerId = playerId;
    }

    @Override
    public MoveRequest getNextMoveRequest() {
        return new MoveRequest(playerId, 1);
    }

    @Override
    public CellState checkResultForShot(UUID playerID, CellCoordinate cellCoordinate) {
        return CellState.EMPTY;
    }

    @Override
    public GameStatus getGameStatus() {
        if (--moveCount > 0)
            return GameStatus.RUNNING;

        return GameStatus.VICTORY;
    }
}
