package org.coopmobil.ships.views;

import org.coopmobil.ships.adapter.ImageAdapter;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.GridView;

public class SpielfeldGridView extends GridView {
	
	static ImageAdapter mAdapter = null;

	public SpielfeldGridView(Context context, AttributeSet attributes) {
		super(context, attributes);

		if(mAdapter == null)
			mAdapter = new ImageAdapter(this.getContext());
	
		setColumnWidth(GridCalculator.getFieldSizePixel());
	}
	
  
	@Override
    protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);


		/*
		problem: es l�uft erst ImageAdapter.getView() und danach onDraw..
		
		*/
    	//Gittergr��e neu berechnen
		GridCalculator.calculate(this.getWidth(), this.getHeight());
		
		if (getAdapter() == null)
			 setAdapter(mAdapter);
    }	


	public SpielfeldGridView(Context context) {
		this(context, null); // Konstruktor f�r den Layout-Designer (Graphical Layout)
	}
	
}
