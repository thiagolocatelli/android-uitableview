package br.com.dina.ui.model;

import android.view.View;

public class ViewItem implements IListItem {

	private View mView;
	
	public ViewItem(View view) {
		this.mView = view;
	}
	
	public View getView() {
		return this.mView;
	}
	
}
