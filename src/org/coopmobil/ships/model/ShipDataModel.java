package org.coopmobil.ships.model;

import java.util.List;
import java.util.Observable;

import org.coopmobil.ships.ruler.Ship;

/**
 * Soll als Beispiel f�r die Model-Klasse dienen. 
 * 
 * setShips soll  Observable unterst�tzen und ruft
 * @author MPi
 *
 */
public class ShipDataModel extends Observable{
	
	public void setShips(List<Ship> ships){
		/**
		 * TODO 
		 * Speicher die Schiffe. mach dies, mach das
		 */
		
		setChanged();
		notifyObservers(ships);
	}
}
