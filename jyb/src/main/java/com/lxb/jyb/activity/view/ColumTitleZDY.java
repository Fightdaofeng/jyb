package com.lxb.jyb.activity.view;

import com.lxb.jyb.R;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ColumTitleZDY extends LinearLayout {

	private ImageView imageView;
	private TextView textView;
	private View view;

	public ColumTitleZDY(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		view = inflater.inflate(R.layout.colum_layout, this);
		imageView = (ImageView) view.findViewById(R.id.self_img);
		textView = (TextView) view.findViewById(R.id.self_tv);
		imageView.setBackgroundResource(R.drawable.hq_self);
	}

	public void setImageResource(int resId) {
		imageView.setBackgroundResource(resId);
	}

	public void setTextViewText(String text) {
		textView.setText(text);
	}

	public void setTextSize(int size) {
		textView.setTextSize(size);
	}

	public void setTextColor(ColorStateList colorStateList) {
		textView.setTextColor(colorStateList);
	}

	public void setBackGrand(int resid) {
		imageView.setBackgroundResource(resid);
	}

	public TextView getTextView() {
		return textView;
	}
}
