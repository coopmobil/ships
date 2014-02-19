package org.coopmobil.ships.game;

import java.util.ArrayList;
import java.util.List;

import org.coopmobil.ships.gamefield.GameField;
import org.coopmobil.ships.gamefield.GameFieldCell;
import org.coopmobil.ships.model.ShipDataModel;
import org.coopmobil.ships.player.Player;
import org.coopmobil.ships.player.PlayerFactory;
import org.coopmobil.ships.player.PlayerIDAlreadyExists;
import org.coopmobil.ships.player.PlayerType;
import org.coopmobil.ships.ruler.BattleRuler;
import org.coopmobil.ships.ruler.BattleRulerFactory;
import org.coopmobil.ships.ruler.PlacementNotAllowed;
import org.coopmobil.ships.ruler.PlacementRuler;
import org.coopmobil.ships.ruler.PlacementRulerFactory;
import org.coopmobil.ships.util.GameType;
import org.coopmobil.ships.views.BattlefieldView;


/**
 * Game(Controller) ist Teil des Controllers 
 * 
 * Singelton getInstance() nur per getInstance() ansprechbar
 * 
 * @author MPi
 *
 */
public class Game {
	private List <Player> players = null;
	private GameType gameType;
	
	private PlacementRuler placementRuler;
	private BattleRuler battleRuler;
	
	private GameField gameField;
	private int currentPlayer = 0;
	private ShipDataModel shipDataModel;
	
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
		
	private Game(){
	}

	public static Game getInstance(){
	if(instance == null)
		instance = new Game();
		
		return instance;
	}
	
	/**
	 * init sollte nur einmal gerufen werden
	 * 
	 * @param gameType Type des Spieles
	 * @param battlefieldView BattlefieldView, die im BattlefieldActivity Instanziiert wird
	 */
	public void init(GameType gameType, BattlefieldView battlefieldView) {
		gameField = new GameField(6);
		placementRuler = PlacementRulerFactory.getRuler(gameType);
		battleRuler = BattleRulerFactory.getRuler(gameType);
		
		// der Controller darf Model und View kennen
		shipDataModel = new ShipDataModel();
		shipDataModel.addObserver(battlefieldView);
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
