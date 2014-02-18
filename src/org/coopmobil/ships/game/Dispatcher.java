package org.coopmobil.ships.game;

import org.coopmobil.ships.gamefield.CellCoordinate;
import org.coopmobil.ships.gamefield.CellState;
import org.coopmobil.ships.ruler.BattleRuler;
import org.coopmobil.ships.ruler.MoveRequest;
import org.coopmobil.ships.util.GameStatus;

import java.util.Map;
import java.util.UUID;

/**
 * Created by Michael on 18.02.14.
 * Aufgabe: realisiert den Workflow:
 * - ermittelt nächsten Spieler und Anzahl der Züge
 * - tauscht Nachrichten mit den Spielern aus
 * - synchronisiert die Spieler-Informationen (Spiel zu Ende, wer gewinnt etc.)
 */
public class Dispatcher implements Runnable{

    private Map<UUID, Comm> commMap;
    private BattleRuler referee;

    public Dispatcher(Map<UUID,Comm> commMap, BattleRuler referee) {
        this.commMap = commMap;
        this.referee = referee;
    }


    @Override
    public void run() {
        boolean isRunning = true;

        while( isRunning){
            System.out.println("... running ...");
            MoveRequest move = referee.getNextMoveRequest();

            System.out.println("playerId :" + move.getPlayerId());
            Comm comm = commMap.get(move.getPlayerId());

            CellCoordinate cellCoordinate = comm.requestShot(move.getShootCount());

            CellState cellState = referee.checkResultForShot(move.getPlayerId(), cellCoordinate);
            comm.updateCellState(cellState);

            if(referee.getGameStatus() == GameStatus.VICTORY){
                for( UUID player : commMap.keySet() ){
                    commMap.get(player).sendWinningPlayer(move.getPlayerId());
                }
                isRunning = false;
            }
        }
    }
}
