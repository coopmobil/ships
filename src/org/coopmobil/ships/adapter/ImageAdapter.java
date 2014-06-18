package org.coopmobil.ships.adapter;

import org.coopmobil.ships.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
	private int m = 6;

	public ImageAdapter(Context c) {
		mContext = c;
	}

	public int getCount() {
		return (m) * (m);
		// return mThumbIds.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	// create a new ImageView for each item referenced by the Adapter
	public View getView(int position, View convertView, ViewGroup parent) {

		if (convertView != null) {
			return convertView;
		}

		int y = position / m;
		int x = position - y * m;

		if (x == 0 && y > 0) {
			TextView t = new TextView(mContext);
			char[] c = new char[1];
			c[0] = (char) ('A' + (y - 1));
			t.setText(new String(c));
			t.setTextSize(24);

			return t;
		}
		if (y == 0 && x > 0) {
			TextView t = new TextView(mContext);
			char[] c = new char[1];
			c[0] = (char) ('1' + (x - 1));
			t.setText(new String(c));
			t.setTextSize(24);

			return t;

		}
		if (x == 0 && y == 0) {
			TextView t = new TextView(mContext);
			return t;
			
		} else {
			ImageView imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(8, 8, 8, 8);
			//imageView.setImageResource(mThumbIds[position % mThumbIds.length]);
			return imageView;
		}
	}

	// references to our images
	private Integer[] mThumbIds = { R.drawable.sample_2, R.drawable.sample_3,
			R.drawable.sample_4, R.drawable.sample_5, R.drawable.sample_6,
			R.drawable.sample_7, R.drawable.sample_0, R.drawable.sample_1,
			R.drawable.sample_2, R.drawable.sample_3, R.drawable.sample_4,
			R.drawable.sample_5, R.drawable.sample_6, R.drawable.sample_7,
			R.drawable.sample_0, R.drawable.sample_1, R.drawable.sample_2,
			R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_5,
			R.drawable.sample_6, R.drawable.sample_7 };

}
