package org.coopmobil.ships.temp;

public class GameSettings {
	
		private int gameFieldSize;
		private Rule shipPlaceRule;
		private Rule battleRule;

		public int getGameFieldSize() {
			return gameFieldSize;
		}
		public void setGameFieldSize(int gameFieldSize) {
			this.gameFieldSize = gameFieldSize;
		}
		public Rule getShipPlaceRule() {
			return shipPlaceRule;
		}
		public void setShipPlaceRule(Rule shipPlaceRule) {
			this.shipPlaceRule = shipPlaceRule;
		}
		public Rule getBattleRule() {
			return battleRule;
		}
		public void setBattleRule(Rule battleRule) {
			this.battleRule = battleRule;
		}
		
}
