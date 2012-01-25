package br.com.dina.ui.example;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import br.com.dina.ui.activity.UITableViewActivity;
import br.com.dina.ui.model.BasicItem;
import br.com.dina.ui.model.ViewItem;
import br.com.dina.ui.widget.UITableView.ClickListener;

public class Example6Activity extends UITableViewActivity {	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CustomClickListener listener = new CustomClickListener();
        getUITableView().setClickListener(listener);
    }
        
    private class CustomClickListener implements ClickListener {

		@Override
		public void onClick(int index) {
			Toast.makeText(Example6Activity.this, "item clicked: " + index, Toast.LENGTH_SHORT).show();
		}
    	
    }

	@Override
	protected void populateList() {
		getUITableView().addBasicItem("Example 1", "Summary text 1");
		getUITableView().addBasicItem("Example 1");
		getUITableView().addBasicItem("Example 2", "Summary text 2");
		getUITableView().addBasicItem(new BasicItem("Disabled item", "this is a disabled item", false));
		getUITableView().addBasicItem("Example 3", "Summary text 3");
		getUITableView().addBasicItem(new BasicItem("Disabled item", "this is a disabled item", false));
	
		
		LayoutInflater mInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		RelativeLayout view = (RelativeLayout) mInflater.inflate(R.layout.custom_view, null);
		ViewItem viewItem = new ViewItem(view);
		getUITableView().addViewItem(viewItem);
		
		RelativeLayout v = (RelativeLayout) mInflater.inflate(R.layout.custom_view2, null);
		ViewItem v2 = new ViewItem(v);
		v2.setClickable(false);
		getUITableView().addViewItem(v2);
		
		
	}
    
}