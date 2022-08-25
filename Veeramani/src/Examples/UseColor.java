package Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseColor {

	public static void main (String [] args) {
		
		        // input list of `Color` objects
		        List<Color> colors = new ArrayList<>();
		 
		        colors.add(new Color("RED", "#FF0000"));
		        colors.add(new Color("BLUE", "#0000FF"));
		        colors.add(new Color("GREEN", "#008000"));
		 
		        Map<String, String> map = new HashMap<>();
		 
		        // construct key-value pairs from `name` and `code` fields of `Color` class
		        for (Color ob: colors) {
		            map.put(ob.getName(), ob.getCode());
		        }
		 
		        System.out.println("List : " + colors);
		        System.out.println("Map  : " + map);
		    }
}
