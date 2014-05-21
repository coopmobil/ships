package org.coopmobil.ships.views;

public class OverrunningException  extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public OverrunningException()  
    { 
        super("Auserhalb des Feldes!");
    }
   
	}
