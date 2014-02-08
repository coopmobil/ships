package org.coopmobil.ships;

public class ClickNotAllowedException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClickNotAllowedException()  
    { 
		super("Klick nicht gestattet!");
    }

}
