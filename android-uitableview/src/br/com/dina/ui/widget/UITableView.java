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
	
	private int mIndexController = 0;
	private LayoutInflater mInflater;
	private LinearLayout mMainContainer;
	private LinearLayout mListContainer;
	private List<Item> mItemList;
	private ClickListener mClickListener;
	
	public UITableView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mItemList = new ArrayList<Item>();
		mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mMainContainer = (LinearLayout)  mInflater.inflate(R.layout.list_container, null);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
		addView(mMainContainer, params);				
		mListContainer = (LinearLayout) mMainContainer.findViewById(R.id.buttonsContainer);		
	}
	
	/**
	 * 
	 * @param title
	 * @param summary
	 */
	public void addItem(String title, String summary) {
		mItemList.add(new Item(title, summary));
	}
	
	/**
	 * 
	 * @param drawable
	 * @param title
	 * @param summary
	 */
	public void addItem(int drawable, String title, String summary) {
		mItemList.add(new Item(drawable, title, summary));
	}
	
	/**
	 * 
	 * @param item
	 */
	public void addItem(Item item) {
		mItemList.add(item);
	}
	
	public void commit() {
		mIndexController = 0;
		if(mItemList.size() > 1) {
			for(Item item : mItemList) {
				View itemView;
				if(mIndexController == 0) {
					itemView = mInflater.inflate(R.layout.list_item_top, null);
				}
				else if(mIndexController == mItemList.size()-1) {
					itemView = mInflater.inflate(R.layout.list_item_bottom, null);
				}
				else {
					itemView = mInflater.inflate(R.layout.list_item_middle, null);
				}
				setupItem(itemView, item, mIndexController);
				mListContainer.addView(itemView);
				mIndexController++;
			}
		}
		else if(mItemList.size() == 1) {
			View examView = mInflater.inflate(R.layout.list_item_single, null);
			setupItem(examView, mItemList.get(0), 0);
			mListContainer.addView(examView);
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
				if(mClickListener != null)
					mClickListener.onClick((Integer) view.getTag());
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
		return mItemList.size();
	}
	
	/**
	 * 
	 */
	public void clear() {
		mItemList.clear();
		mListContainer.removeAllViews();
	}
	
	/**
	 * 
	 * @param listener
	 */
	public void setClickListener(ClickListener listener) {
		this.mClickListener = listener;
	}
	
	/**
	 * 
	 */
	public void removeClickListener() {
		this.mClickListener = null;
	}

}
