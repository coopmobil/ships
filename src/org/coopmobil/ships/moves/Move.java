package org.coopmobil.ships.moves;

/**
 * Created by Michael on 09.02.14.
 */
public class Move {
    int x, y;
    Cannon cannon;

    public Move(int x, int y, Cannon cannon) {
        this.x = x;
        this.y = y;
        this.cannon = cannon;
    }

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
        this.cannon = Cannon.SHIP;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Cannon getCannon() {
        return cannon;
    }
}
