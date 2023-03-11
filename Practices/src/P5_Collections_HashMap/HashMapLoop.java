package P5_Collections_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapLoop {
	// Iterating using a for loop
	public static void main(String[] args) {
		Map<String, Integer> stockPrice = new HashMap<>();

		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 213);

		Set<Entry<String, Integer>> entrySet = stockPrice.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println("Company Name: " + entry.getKey() + " Stock Price: " + entry.getValue());
		}
	}
}
