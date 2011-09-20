package br.com.dina.ui.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import br.com.dina.ui.widget.UIButton;
import br.com.dina.ui.widget.UIButton.ClickListener;

public class Example7Activity extends Activity {

	private UIButton mButton1, mButton2, mButton3;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.single_button_example);

		mButton1 = (UIButton) findViewById(R.id.myButton1);
		mButton2 = (UIButton) findViewById(R.id.myButton2);
		mButton3 = (UIButton) findViewById(R.id.myButton3);

		CustomClickListener listener = new CustomClickListener();
		
		mButton1.addClickListener(listener);
		mButton2.addClickListener(listener);
		mButton3.addClickListener(listener);
		

	}
	
	 private class CustomClickListener implements ClickListener {

			@Override
			public void onClick(View view) {
				Toast.makeText(Example7Activity.this, "button clicked", Toast.LENGTH_SHORT).show();
				
			}
	    	
	    }

}