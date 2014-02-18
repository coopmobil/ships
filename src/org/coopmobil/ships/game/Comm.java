package org.coopmobil.ships.game;

import org.coopmobil.ships.gamefield.CellCoordinate;
import org.coopmobil.ships.gamefield.CellState;

import java.util.UUID;

/**
 * Created by Michael on 18.02.14.
 *
 * Regelt die Kommunikation mit den Spielern
 * - nächste Schuesse erfragen
 * - Spieler über Treffer informieren
 * - Spieler über Spielstatus informieren
 */
public interface Comm {
    CellCoordinate requestShot(int shootCount);

    void updateCellState(CellState cellState);

    void sendWinningPlayer(UUID playerId);
}
