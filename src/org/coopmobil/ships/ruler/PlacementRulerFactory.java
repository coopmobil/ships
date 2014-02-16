package org.coopmobil.ships.ruler;

import org.coopmobil.ships.game.GameType;
import org.coopmobil.ships.ruler.extended.PlacementRulerExtended;
import org.coopmobil.ships.ruler.simple.PlacementRulerSimple;

public class PlacementRulerFactory {
public static PlacementRuler getRuler(GameType gameType)
{
	PlacementRuler placementRuler = null;
	if (gameType == GameType.EXTENDED)
		placementRuler = new PlacementRulerExtended();
	else
		placementRuler = new PlacementRulerSimple();
	return placementRuler;
	
}
}
