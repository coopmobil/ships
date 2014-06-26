package org.coopmobil.ships.adapter;

import org.coopmobil.ships.R;
import org.coopmobil.ships.views.GridCalculator;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
//	private int m = 6;

	public ImageAdapter(Context c) {
		mContext = c;
	}

	public int getCount() {
		return (GridCalculator.getFieldCount()) * (GridCalculator.getFieldCount());
	
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	// create a new ImageView for each item referenced by the Adapter
	public View getView(int position, View convertView, ViewGroup parent) {
		final int fieldSizeInPx = GridCalculator.getFieldSizePixel();
		if (convertView != null) {
			return convertView;
		}

		int y = position / (GridCalculator.getFieldCount() +1);
		int x = position - y * (GridCalculator.getFieldCount() +1);
		TextView tv;

		if (x == 0 && y > 0) {
			tv = getNewTextView((char) ('A' + (y - 1)));
			tv.setBackgroundColor(Color.WHITE);
			tv.setLayoutParams(new GridView.LayoutParams(fieldSizeInPx, fieldSizeInPx));
			return tv;
		}
		if (y == 0 && x > 0) {
			tv = getNewTextView((char) ('1' + (x - 1)));
			tv.setBackgroundColor(Color.WHITE);
			tv.setLayoutParams(new GridView.LayoutParams(fieldSizeInPx, fieldSizeInPx));
			return tv;
		}
		if (x == 0 && y == 0) {
			tv = getNewTextView((char) ' ');
			tv.setLayoutParams(new GridView.LayoutParams(fieldSizeInPx, fieldSizeInPx));
			tv.setBackgroundColor(Color.WHITE);
			return tv;

		} else {
			ImageView imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(fieldSizeInPx, fieldSizeInPx));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(8, 8, 8, 8);
			imageView.setImageResource(mThumbIds[position %
			 mThumbIds.length]);
			return imageView;
		}
	}

	private TextView getNewTextView(char c) {
		TextView tv = new TextView(mContext);
		char[] cField = new char[1];
		cField[0] = c;
		tv.setText(new String(cField));
		tv.setTextSize(24);
		tv.setPadding(0, 0, 0, 0);
		tv.setGravity(Gravity.CENTER);

		return tv;
	}

	// references to our images
	private Integer[] mThumbIds = {  R.drawable.sample_0, R.drawable.sample_1,R.drawable.sample_2, R.drawable.sample_3,
			R.drawable.sample_4, R.drawable.sample_5, R.drawable.sample_6,
			R.drawable.sample_7, R.drawable.sample_0, R.drawable.sample_1,
			R.drawable.sample_2, R.drawable.sample_3, R.drawable.sample_4,
			R.drawable.sample_5, R.drawable.sample_6, R.drawable.sample_7,
			R.drawable.sample_0, R.drawable.sample_1, R.drawable.sample_2,
			R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_5,
			R.drawable.sample_6, R.drawable.sample_7,
			R.drawable.sample_0, R.drawable.sample_1, R.drawable.sample_2,
			R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_5,
			R.drawable.sample_6, R.drawable.sample_7, 
			R.drawable.sample_0, R.drawable.sample_1, R.drawable.sample_2,
			R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_5,
			R.drawable.sample_6, R.drawable.sample_7};

}
