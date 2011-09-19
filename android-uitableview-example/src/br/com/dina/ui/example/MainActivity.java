package br.com.dina.ui.example;


import br.com.dina.ui.widget.UITableView;
import br.com.dina.ui.widget.UITableView.ClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    
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
    	tableView.addItem("UITableView Example 1", "without images");
    	tableView.addItem("UITableView Example 2", "with images");
    	tableView.addItem("UITableView Example 3", "just a few items");
    	tableView.addItem("UITableView Example 4", "only one item");
    	tableView.addItem("UITableViewActivity Example 5", "a sample activity");
    	tableView.addItem("UIButton Example 6", "some floating buttons");
    	
    }
    
    private class CustomClickListener implements ClickListener {

		@Override
		public void onClick(int index) {
			Log.d("MainActivity", "item clicked: " + index);
			if(index == 0) {
				Intent i = new Intent(MainActivity.this, Example1Activity.class);
				startActivity(i);
			}
			else if(index == 1) {
				Intent i = new Intent(MainActivity.this, Example2Activity.class);
				startActivity(i);				
			}
			else if(index == 2) {
				Intent i = new Intent(MainActivity.this, Example3Activity.class);
				startActivity(i);				
			}
			else if(index == 3) {
				Intent i = new Intent(MainActivity.this, Example4Activity.class);
				startActivity(i);				
			}
			else if(index == 4) {
				Intent i = new Intent(MainActivity.this, Example5Activity.class);
				startActivity(i);				
			}
		}
    	
    }
    
}