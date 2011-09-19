package br.com.dina.ui.widget;


import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import br.com.dina.ui.R;
import br.com.dina.ui.model.Item;

public class UITableView extends RelativeLayout {
	
	private int customItemBackground = 0;
	private int customItemTextColor = 0;
	
	private int indexControler = 0;
	private LayoutInflater mInflater;
	private LinearLayout mainContainer;
	private LinearLayout listContainer;
	private List<Item> itemList;
	private ClickListener clickListener;
	
	public UITableView(Context context, AttributeSet attrs) {
		super(context, attrs);
		itemList = new ArrayList<Item>();
		mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mainContainer = (LinearLayout)  mInflater.inflate(R.layout.list_container, null);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
		addView(mainContainer, params);				
		listContainer = (LinearLayout) mainContainer.findViewById(R.id.buttonsContainer);		
	}
	
	/**
	 * 
	 * @param title
	 * @param summary
	 */
	public void addItem(String title, String summary) {
		itemList.add(new Item(title, summary));
	}
	
	/**
	 * 
	 * @param drawable
	 * @param title
	 * @param summary
	 */
	public void addItem(int drawable, String title, String summary) {
		itemList.add(new Item(drawable, title, summary));
	}
	
	/**
	 * 
	 * @param item
	 */
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	public void commit() {
		indexControler = 0;
		if(itemList.size() > 1) {
			for(Item item : itemList) {
				View itemView;
				if(indexControler == 0) {
					itemView = mInflater.inflate(R.layout.list_item_top, null);
				}
				else if(indexControler == itemList.size()-1) {
					itemView = mInflater.inflate(R.layout.list_item_bottom, null);
				}
				else {
					itemView = mInflater.inflate(R.layout.list_item_middle, null);
				}
				setupItem(itemView, item, indexControler);
				listContainer.addView(itemView);
				indexControler++;
			}
		}
		else if(itemList.size() == 1) {
			View examView = mInflater.inflate(R.layout.list_item_single, null);
			setupItem(examView, itemList.get(0), 0);
			listContainer.addView(examView);
		}
	}
	
	/**
	 * 
	 * @param view
	 * @param item
	 * @param index
	 */
	private void setupItem(View view, Item item, int index) {
		if(item.getDrawable() > -1) {
			((ImageView) view.findViewById(R.id.image)).setBackgroundResource(item.getDrawable());
		}
		if(item.getSummary() != null) {
			((TextView) view.findViewById(R.id.subtitle)).setText(item.getSummary());
		}
		else {
			((TextView) view.findViewById(R.id.subtitle)).setVisibility(View.GONE);
		}		
		((TextView) view.findViewById(R.id.title)).setText(item.getTitle());
		view.setTag(index);
		view.setClickable(true);
		view.setOnClickListener( new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				if(clickListener != null)
					clickListener.onClick((Integer) view.getTag());
			}
			
		});		
	}
	
	public interface ClickListener {		
		void onClick(int index);		
	}
	
	/**
	 * 
	 * @return
	 */
	public int getCount() {
		return itemList.size();
	}
	
	/**
	 * 
	 */
	public void clear() {
		itemList.clear();
		listContainer.removeAllViews();
	}
	
	/**
	 * 
	 * @param listener
	 */
	public void setClickListener(ClickListener listener) {
		this.clickListener = listener;
	}
	
	/**
	 * 
	 */
	public void removeClickListener() {
		this.clickListener = null;
	}
	
	public void setItemBackgroundResource(int background) {
		this.customItemBackground = background;
	}
	
	public void setItemTextColorResource(int textColor) {
		this.customItemTextColor = textColor;
	}

}
