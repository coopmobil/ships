package org.coopmobil.ships.player;

import org.coopmobil.ships.game.Game;
import org.coopmobil.ships.gamefield.GameField;
import org.coopmobil.ships.gamefield.GameFieldMode;

public class RealPlayer implements Player {
	private String id;
	private GameField gameField;
	private Game game;
	
	public RealPlayer(String id,int gameFieldSize)
	{
		this.id = id;
		gameField = new GameField(gameFieldSize);
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public GameField getGameField() {
		return gameField;
	}
	public void setGameField(GameField gameField) {
		this.gameField = gameField;
	}
	public void setGameFieldMode(GameFieldMode gameFieldMode)
	{}

}
