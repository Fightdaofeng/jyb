package com.lxb.jyb.fragment;

import com.lxb.jyb.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * 资讯
 * @author liuxiaobin
 *
 */
public class Fragment_jypl extends Fragment {
	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.fragment_jypl, container, false);
		return view;
	}

}
