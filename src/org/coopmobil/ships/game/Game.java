package org.coopmobil.ships.game;

import java.util.ArrayList;
import java.util.List;

import org.coopmobil.ships.gamefield.GameField;
import org.coopmobil.ships.gamefield.GameFieldCell;
import org.coopmobil.ships.player.Player;
import org.coopmobil.ships.player.PlayerFactory;
import org.coopmobil.ships.player.PlayerIDAlreadyExists;
import org.coopmobil.ships.player.PlayerType;
import org.coopmobil.ships.ruler.BattleRuler;
import org.coopmobil.ships.ruler.BattleRulerFactory;
import org.coopmobil.ships.ruler.PlacementNotAllowed;
import org.coopmobil.ships.ruler.PlacementRuler;
import org.coopmobil.ships.ruler.PlacementRulerFactory;

public class Game {
	private List <Player> players = null;
	private GameType gameType;
	
	private PlacementRuler placementRuler;
	private BattleRuler battleRuler;
	
	private GameField gameField;
	private int currentPlayer = 0;
	
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
	
	public void init(GameType gameType) {
		// TODO Auto-generated method stub
		gameField = new GameField(6);
		placementRuler = PlacementRulerFactory.getRuler(gameType);
		battleRuler = BattleRulerFactory.getRuler(gameType);
	}
	public void playerSignOn(String id)
	throws PlayerIDAlreadyExists
	{
		if (players == null)
			players = new ArrayList<Player>();
		for(Player p:players)
		{
			if (p.getId() == id)
				throw new PlayerIDAlreadyExists();
		}
		Player player = PlayerFactory.getPlayer(PlayerType.REAL_PLAYER,id,placementRuler.getGameFieldSize());
		players.add(player);
			
	}
}
