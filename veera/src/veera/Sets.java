package veera;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// creating LinkedHashSet using the Set
		Set<String> data = new LinkedHashSet<String>();

		data.add("JavaTpoint");
		data.add("Set");
		data.add("Example");
		data.add("Set");

		System.out.println(data);
	}
}
