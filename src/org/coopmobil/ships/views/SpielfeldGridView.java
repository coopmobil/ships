package org.coopmobil.ships.views;

import org.coopmobil.ships.adapter.ImageAdapter;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.GridView;
import android.widget.ListAdapter;

public class SpielfeldGridView extends GridView {

	static ImageAdapter mAdapter = null;

	private static int c_FieldCount = 6; // Anzahl der Felder im Feld (später
											// durch Config gesetzt)

	public static int getFieldCountPlus1() {
		return c_FieldCount +1 ;
	}

	public SpielfeldGridView(Context context, AttributeSet attributes) {
		super(context, attributes);

		if (mAdapter == null)
			mAdapter = new ImageAdapter(this);
		setAdapter(mAdapter);
		setNumColumns(getFieldCountPlus1());

		setColumnWidth(calculatemFieldSizePixel());
	}

	private int calculatemFieldSizePixel() {

		int sizeX = this.getWidth() / getFieldCountPlus1();
		int sizeY = this.getHeight() / getFieldCountPlus1();

		// System.out.println("calculate -- width: " + width + " height: " + height);
		// System.out.println("sizeX: " + sizeX + " sizeY: " + sizeY);

		return Math.min(sizeX, sizeY);
	}

	@Override
	public void setAdapter(ListAdapter adapter) {
		// GridCalculator.calculate(this.getWidth(), this.getHeight());
		super.setAdapter(adapter);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		setColumnWidth(calculatemFieldSizePixel());
	}

	public SpielfeldGridView(Context context) {
		this(context, null); // Konstruktor für den Layout-Designer (Graphical Layout)
	}

}
