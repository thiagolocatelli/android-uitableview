package br.com.dina.ui.model;

public class BasicItem implements IListItem {
	
	private boolean mClickable = true;
	private int mDrawable = -1;
	private String mTitle;
	private String mSubtitle;
	private int mColor = -1;
	

	public BasicItem(String _title) {
		this.mTitle = _title;
	}
	
	public BasicItem(String _title, String _subtitle) {
		this.mTitle = _title;
		this.mSubtitle = _subtitle;
	}
	
	public BasicItem(String _title, String _subtitle, int _color) {
		this.mTitle = _title;
		this.mSubtitle = _subtitle;
		this.mColor = _color;
	}
	
	public BasicItem(String _title, String _subtitle, boolean _clickable) {
		this.mTitle = _title;
		this.mSubtitle = _subtitle;
		this.mClickable = _clickable;
	}	
	
	public BasicItem(int _drawable, String _title, String _subtitle) {
		this.mDrawable = _drawable;
		this.mTitle = _title;
		this.mSubtitle = _subtitle;
	}
	
	public BasicItem(int _drawable, String _title, String _subtitle, int _color) {
		this.mDrawable = _drawable;
		this.mTitle = _title;
		this.mSubtitle = _subtitle;
		this.mColor = _color;
	}

	public int getDrawable() {
		return mDrawable;
	}

	public void setDrawable(int drawable) {
		this.mDrawable = drawable;
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		this.mTitle = title;
	}

	public String getSubtitle() {
		return mSubtitle;
	}

	public void setSubtitle(String summary) {
		this.mSubtitle = summary;
	}

	public int getColor() {
		return mColor;
	}

	public void setColor(int mColor) {
		this.mColor = mColor;
	}

	@Override
	public boolean isClickable() {
		return mClickable;
	}

	@Override
	public void setClickable(boolean clickable) {
		mClickable = clickable;			
	}
	
}
