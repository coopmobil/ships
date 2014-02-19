package org.coopmobil.ships.game;

import junit.framework.TestCase;
import org.coopmobil.ships.game.testhelper.BattleRulerMock;
import org.coopmobil.ships.game.testhelper.CommMock;
import org.coopmobil.ships.ruler.BattleRuler;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Michael on 18.02.14.
 */
public class DispatcherTest extends TestCase {
    private UUID playerId;
    private BattleRuler battleRuler;
    private Map<UUID, Comm> commMap;
    private Dispatcher dispatcher;

    public void setUp() throws Exception {
        super.setUp();

        playerId = UUID.randomUUID();

        battleRuler = new BattleRulerMock(playerId);

        commMap = new HashMap<UUID, Comm>();
        commMap.put(playerId, new CommMock());
        dispatcher = new Dispatcher(commMap, battleRuler);
    }

    public void tearDown() throws Exception {

    }

    public void testRun() throws Exception {
        Thread thread = new Thread(dispatcher);

        thread.start();
        thread.join(4000);

    }
}
