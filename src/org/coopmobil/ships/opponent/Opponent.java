package org.coopmobil.ships.opponent;

import java.util.Collection;
import java.util.List;

/**
 * Created by Michael on 09.02.14.
 */
public interface Opponent {

    public Collection<List> getMoves(int count);
}
