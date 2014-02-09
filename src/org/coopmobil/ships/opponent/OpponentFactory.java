package org.coopmobil.ships.opponent;

import org.coopmobil.ships.opponent.computer.ComputerOpponent;

/**
 * Created by Michael on 09.02.14.
 */
public class OpponentFactory {

    private OpponentFactory() {
    }

    public static Opponent createOpponent(int dimension, PlayType playType, OpponentType opponentType) {
        switch (opponentType) {
            case COMPUTER:
                return new ComputerOpponent(dimension, playType);
            default:
                throw new RuntimeException("Gegnertyp wird nicht unterstützt (" + opponentType + ")!");
        }
    }
}
