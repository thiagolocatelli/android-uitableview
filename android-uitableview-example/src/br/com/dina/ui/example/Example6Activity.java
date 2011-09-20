package br.com.dina.ui.example;

import android.os.Bundle;
import android.widget.Toast;
import br.com.dina.ui.activity.UITableViewActivity;
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
		getUITableView().addBasicItem("Example 2", "Summary text 2");
		getUITableView().addBasicItem("Example 3", "Summary text 3");
	
		
	}
    
}