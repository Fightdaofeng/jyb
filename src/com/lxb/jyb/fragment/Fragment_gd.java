package com.lxb.jyb.fragment;

import com.lxb.jyb.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 建仓
 * 
 * @author Liuxiaobin
 *
 */
public class Fragment_gd extends Fragment {
	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.fragment_gd, null, false);

		return view;
	}

}
