package org.coopmobil.ships.util;

import org.coopmobil.ships.gamefield.CellState;

import java.util.UUID;

/**
 * Created by Michael on 18.02.14.
 */
public class MovementResult {
    private GameStatus gameStatus;
    private CellState cellState;
    private UUID playerId;


    public MovementResult(GameStatus gameStatus, CellState cellState, UUID playerId) {
        this.gameStatus = gameStatus;
        this.cellState = cellState;
        this.playerId = playerId;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public CellState getCellState() {
        return cellState;
    }

    public UUID getPlayerId() {
        return playerId;
    }
}
