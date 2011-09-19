package br.com.dina.ui.model;

public class Item {
	
	private int drawable = -1;
	private String title;
	private String summary;
	

	public Item(String _title) {
		this.title = _title;
	}
	
	public Item(String _title, String _summary) {
		this.title = _title;
		this.summary = _summary;
	}
	
	public Item(int _drawable, String _title, String _summary) {
		this.drawable = _drawable;
		this.title = _title;
		this.summary = _summary;
	}

	public int getDrawable() {
		return drawable;
	}

	public void setDrawable(int drawable) {
		this.drawable = drawable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}	
	
}
