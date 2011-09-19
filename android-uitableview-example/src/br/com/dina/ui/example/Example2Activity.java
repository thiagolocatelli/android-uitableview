package br.com.dina.ui.example;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import br.com.dina.ui.widget.UITableView;
import br.com.dina.ui.widget.UITableView.ClickListener;

public class Example2Activity extends Activity {
    
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
    	tableView.addItem(R.drawable.user_image, "Example 1", "Summary text 1");
    	tableView.addItem("Example 2", "Summary text 2");
    	tableView.addItem(R.drawable.user_image, "Example 3", "Summary text 3");
    	tableView.addItem("Example 4", "Summary text 4");
    	tableView.addItem(R.drawable.user_image, "Example 5", "Summary text 5");
    	tableView.addItem("Example 6", "Summary text 6");
    	tableView.addItem(R.drawable.user_image, "Example 7", "Summary text 7");
    	tableView.addItem("Example 8", "Summary text 8");  
    	tableView.addItem(R.drawable.user_image, "Example 9", "Summary text 9");
    	tableView.addItem("Example 10", "Summary text 10");
    }
    
    private class CustomClickListener implements ClickListener {

		@Override
		public void onClick(int index) {
			Toast.makeText(Example2Activity.this, "item clicked: " + index, Toast.LENGTH_SHORT).show();
		}
    	
    }
    
}