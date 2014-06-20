package org.coopmobil.ships.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class SpielfeldGridView extends GridView {

	public SpielfeldGridView(Context context, AttributeSet attributes) {
		super(context, attributes);

		setColumnWidth(168);
	
		
		// TODO Auto-generated constructor stub
	}

	public SpielfeldGridView(Context context) {
		this(context, null); // Konstruktor für den Layout-Designer (Graphical Layout)
	}
	
}
