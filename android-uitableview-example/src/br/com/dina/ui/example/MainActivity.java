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
    	tableView.addBasicItem("Example 1 - UITableView", "without images");
    	tableView.addBasicItem("Example 2 - UITableView", "with images");
    	tableView.addBasicItem("Example 3 - UITableView", "just a few items");
    	tableView.addBasicItem("Example 4 - UITableView", "only one item");
    	tableView.addBasicItem("Example 5 - UITableViewActivity", "a sample activity");
    	tableView.addBasicItem("Example 6 - UITableViewActivity temp", "item with custom view");
    	tableView.addBasicItem("Example 7 - UIButton", "some floating buttons");
    	tableView.addBasicItem("Example 8 - Clear List", "this button will clear the list");
    	
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
			else if(index == 5) {
				Intent i = new Intent(MainActivity.this, Example6Activity.class);
				startActivity(i);				
			}
			else if(index == 6) {
				Intent i = new Intent(MainActivity.this, Example7Activity.class);
				startActivity(i);				
			}
			else if(index == 7) {
				tableView.clear();		
			}
			
		}
    	
    }
    
}