package org.coopmobil.ships.player;

public class PlayerFactory {
	public static Player getPlayer(PlayerType playerType,String playerId,int gameFieldSize)
	{
		Player player = null;
		
		if(playerType == PlayerType.REAL_PLAYER)
			player = new RealPlayer(playerId,gameFieldSize); 
			return player;
	}

}
