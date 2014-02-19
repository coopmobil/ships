package org.coopmobil.ships.game.testhelper;

import org.coopmobil.ships.game.Comm;
import org.coopmobil.ships.gamefield.CellCoordinate;
import org.coopmobil.ships.gamefield.CellState;

import java.util.UUID;

/**
 * Created by Michael on 18.02.14.
 */
public class CommMock implements Comm {

    public CommMock(){
    }


    @Override
    public CellCoordinate requestShot(int shootCount) {
        return new CellCoordinate(1,1);
    }

    @Override
    public void updateCellState(CellState cellState) {
    }

    @Override
    public void sendWinningPlayer(UUID playerId) {
        System.out.println("Winner is " + playerId);
    }
}
