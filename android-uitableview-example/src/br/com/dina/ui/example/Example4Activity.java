package br.com.dina.ui.example;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import br.com.dina.ui.model.BasicItem;
import br.com.dina.ui.widget.UITableView;
import br.com.dina.ui.widget.UITableView.ClickListener;

public class Example4Activity extends Activity {
    
	UITableView tableView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);        
        tableView = (UITableView) findViewById(R.id.tableView);        
        createList();        
        Log.d("MainActivity", "total items: " + tableView.getCount());        
        tableView.commit();
    }
    
    private void createList() {
    	CustomClickListener listener = new CustomClickListener();
    	tableView.setClickListener(listener);
    	BasicItem i1 = new BasicItem("Search");
    	i1.setSummary("Click here to search for friends");
    	i1.setDrawable(R.drawable.search_image);   	
    	tableView.addBasicItem(i1);
   
    }
    
    private class CustomClickListener implements ClickListener {

		@Override
		public void onClick(int index) {
			Toast.makeText(Example4Activity.this, "item clicked: " + index, Toast.LENGTH_SHORT).show();
		}
    	
    }
    
}