package org.coopmobil.ships.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.GridView;

public class SpielfeldGridView extends GridView {

	public SpielfeldGridView(Context context, AttributeSet attributes) {
		super(context, attributes);

	
		setColumnWidth(GridCalculator.getFieldSizePixel());
	}
	
  
	@Override
    protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

    	//Gittergröße neu berechnen
		GridCalculator.calculate(this.getWidth(), this.getHeight());
    }	


	public SpielfeldGridView(Context context) {
		this(context, null); // Konstruktor für den Layout-Designer (Graphical Layout)
	}
	
}
