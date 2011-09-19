package br.com.dina.ui.example;

import android.os.Bundle;
import android.widget.Toast;
import br.com.dina.ui.activity.UITableViewActivity;
import br.com.dina.ui.widget.UITableView.ClickListener;

public class Example5Activity extends UITableViewActivity {	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CustomClickListener listener = new CustomClickListener();
        getUITableView().setClickListener(listener);
    }
        
    private class CustomClickListener implements ClickListener {

		@Override
		public void onClick(int index) {
			Toast.makeText(Example5Activity.this, "item clicked: " + index, Toast.LENGTH_SHORT).show();
		}
    	
    }

	@Override
	protected void populateList() {
		getUITableView().addItem("Example 1", "Summary text 1");
		getUITableView().addItem("Example 2", "Summary text 2");
		getUITableView().addItem("Example 3", "Summary text 3");
		getUITableView().addItem("Example 4", "Summary text 4");
		getUITableView().addItem("Example 5", "Summary text 5");		
	}
    
}