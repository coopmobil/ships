package org.coopmobil.ships;

import java.util.List;

import org.coopmobil.ships.opponent.PlayType;
import org.coopmobil.ships.player.Player;
import org.coopmobil.ships.ruler.BattleRuler;
import org.coopmobil.ships.ruler.PlacementRuler;
import org.coopmobil.ships.temp.GameField;
import org.coopmobil.ships.temp.GameFieldCell;
import org.coopmobil.ships.temp.PlacementNotAllowed;
//import org.coopmobil.ships.ruler.Ship;

public class Game {
	private List <Player> players;
	private PlayType gameType;
	
	private PlacementRuler placementruler;
	private BattleRuler battleRuler;
	
	private GameField gameField;
	
	public GameField setShip(List<GameFieldCell> cells)
			throws PlacementNotAllowed
			{
		
		// setShipFor(PlayerA);
		
		return gameField;
			};
	/*
	public boolean isPlacementPossible(Player playerID,List<Ship> ships)
	{
	 public List<Ship> getLocalShips(playerID);
	}
*/
	private static Game instance;
	
	public static Game getInstance()
	{
	if(instance == null)
		instance = new Game();
		
		return instance;
	}
	
	protected Game()
	{
	  
	}

	public void init() {
		// TODO Auto-generated method stub
		gameField = new GameField(6);
		// ...
	}
}
