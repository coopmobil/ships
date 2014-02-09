package org.coopmobil.ships;

public class RealArbitrator {
	private GameField ownGameField;
	private GameField enemyGameField;
	private Rule shipPlaceRule;
	private Rule battleRule;

	public RealArbitrator(GameSettings gameSettings) {
		ownGameField = new GameField(gameSettings.getGameFieldSize());
		enemyGameField = new GameField(gameSettings.getGameFieldSize());
		shipPlaceRule = gameSettings.getShipPlaceRule();
		battleRule = gameSettings.getBattleRule();
	}
	

	public FieldModel getOwnFieldModel() {
		return ownGameField.getFieldModel();
	}

	
	public FieldModel getEnemyFieldModel() {
		return enemyGameField.getFieldModel();
	}

	
	public void setEnemyGameField(GameField enemyGameField) {
		this.enemyGameField = enemyGameField;
	}


	public FieldModel doOwnFieldClick(int horizontalCoordinate,
			int verticalCoordinate) throws ClickNotAllowedException {
		CellState newCellState;
		if (ownGameField.getMode() == GameFieldMode.SHIP_PLACING) {
			newCellState = shipPlaceRule.getStateAfteClick(
					horizontalCoordinate, verticalCoordinate,
					ownGameField.getFieldModel());
			try {
				ownGameField.setNewCellState(horizontalCoordinate,
						verticalCoordinate, newCellState);
			} catch (OverrunningException ex) {
				throw new ClickNotAllowedException();
			}
		}

		else {
			throw new ClickNotAllowedException();
		}
		return ownGameField.getFieldModel();
	}

	
	public CellState getOwnFieldClick(int horizontalCoordinate,
			int verticalCoordinate) throws ClickNotAllowedException {
		CellState newCellState = null;
		if (ownGameField.getMode() == GameFieldMode.WAIT) {
			newCellState = battleRule.getStateAfteClick(horizontalCoordinate,
					verticalCoordinate, ownGameField.getFieldModel());
			try {
				ownGameField.setNewCellState(horizontalCoordinate,
						verticalCoordinate, newCellState);
			} catch (OverrunningException ex) {
				throw new ClickNotAllowedException();
			}
		}

		else {
			throw new ClickNotAllowedException();
		}
		return newCellState;
	}
	
	public FieldModel doEnemyFieldClick(int horizontalCoordinate,
			int verticalCoordinate) throws ClickNotAllowedException {
		CellState newCellState = CellState.EXPLODED_SHIP;// dummy
		try {
			enemyGameField.setNewCellState(horizontalCoordinate,
					verticalCoordinate, newCellState);
		} catch (OverrunningException ex) {
			throw new ClickNotAllowedException();
		}
		return enemyGameField.getFieldModel();
	}

		
	}
