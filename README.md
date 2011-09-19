# UITableView for Android

![UITableView](http://grem.io/images/uitable-view.png "UITableView")

## Usage

### UITableView

#### Defining your layout

    <br.com.dina.ui.widget.UITableView 
        android:id="@+id/tableView" 
        style="@style/UITableView" />

#### Working on your activity



### UITableViewActivity

In order to use the a default list you can extend the [UITableViewActivity](https://github.com/thiagolocatelli/android-uitableview/blob/master/android-uitableview/src/br/com/dina/ui/activity/UITableViewActivity.java), a simple example can be found in the source code below:

	public class ExampleActivity extends UITableViewActivity {	
		
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        CustomClickListener listener = new CustomClickListener();
	        getUITableView().setClickListener(listener);
	    }
	        
	    private class CustomClickListener implements ClickListener {	
			@Override
			public void onClick(int index) {
				Toast.makeText(ExampleActivity.this, "item clicked: " + index, Toast.LENGTH_SHORT).show();
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

In this example you don't even need to care about the xml since the  [UITableViewActivity](https://github.com/thiagolocatelli/android-uitableview/blob/master/android-uitableview/src/br/com/dina/ui/activity/UITableViewActivity.java) is using a default layout template the only displays the list in the screen. It is pretty mych the same list you are seeing in the screenshot provided at the beginning of this explanation.

### Customization
UITableView is an Android Library Project and all its resources will be merged into the referring project. So, in order tu customize the colors of the UITableView and its elements, you need to create the same resources on your own project and this resources will be before the default values provided by the library project.

If you don't like the default colors that is defined in the [colors.xml](https://github.com/thiagolocatelli/android-uitableview/blob/master/android-uitableview/res/values/colors.xml) file simply override the default values in the main projects colors.xml file. These are the keys you need to work on to have your customized UITableView working.

    <?xml version="1.0" encoding="utf-8"?>
    <resources>	
        <!-- LIST BORDER COLOR -->
        <color name="rounded_container_border">#ffb7babb</color>

        <!-- ITEM BACKGROUND COLOR - STATE - DEFAULT -->
        <color name="base_start_color_default">#FFFFFF</color>
        <color name="base_end_color_default">#FFFFFF</color>
    	
        <!-- ITEM BACKGROUND COLOR - STATE - PRESSED -->
        <color name="base_start_color_pressed">#ff3590c4</color>
        <color name="base_end_color_pressed">#ff2570ba</color>
    
        <!-- ITEM TEXT COLORS - STATES - PRESSED AND DEFAULT -->
        <color name="text_color_default">#000000</color>
        <color name="text_color_pressed">#ffffff</color>			
    </resources> 

#### Example	

![UITableView](http://grem.io/images/uitable-view2.png "UITableView")

The theme above was created using the following set of colors:

	<resources>
		<color name="rounded_container_border">#50b7babb</color>
		<color name="base_start_color_default">#B0FFFFFF</color>
	    <color name="base_end_color_default">#B0FFFFFF</color>
		<color name="base_start_color_pressed">#B03590c4</color>
	    <color name="base_end_color_pressed">#B02570ba</color>
	    <color name="text_color_default">#000000</color>
	    <color name="text_color_pressed">#ffffff</color>   
	</resources>
	
## Android applications using it	
	
## Contributions

Functionallity improvements and performance enhancements are always welcome. Feel free to fork and apply your changes.

### TODO list

* Hability to let the user define the custom layout for the item
* Hability to create Items that expand/collapse a set of items

## Other Android Libraries

Use these libraries also to get a better UI for your android application

* [Android ActionBar](https://github.com/johannilsson/android-actionbar) by Johan Nilsson
* [Android Pull to Refresh](https://github.com/johannilsson/android-pulltorefresh) by Johan Nilsson
* [SwipeView](https://github.com/fry15/uk.co.jasonfry.android.tools) by Jason Fry



## License
Copyright (c) 2010 [Thiago Locatelli] - "thiago:locatelli$gmail:com".replace(':','.').replace('$','@')

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)