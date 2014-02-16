
package org.coopmobil.ships.ruler;

import org.coopmobil.ships.game.GameType;
import org.coopmobil.ships.ruler.extended.BattleRulerExtended;
import org.coopmobil.ships.ruler.simple.BattleRulerSimple;

public class BattleRulerFactory {
public static BattleRuler getRuler(GameType gameType)
{
	BattleRuler battleRuler = null;
	if (gameType == GameType.EXTENDED)
		battleRuler = new BattleRulerExtended();
	else
		battleRuler = new BattleRulerSimple();
	return battleRuler;
	
}
}