# UITableView for Android

![UITableView](http://grem.io/images/uitable-view.png "UITableView")

## Usage

### UITableView

### UITableViewActivity

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

## Android applications using it	
	
## Contributions

## License
Copyright (c) 2010 [Thiago Locatelli] - "thiago:locatelli$gmail:com".replace(':','.').replace('$','@')

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)