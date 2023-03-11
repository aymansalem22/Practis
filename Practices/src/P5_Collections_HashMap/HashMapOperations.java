package P5_Collections_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapOperations {
	public static void main(String[] args) {
		Map<String, Integer> stockPrice = new HashMap<>();
		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 213);

		System.out.println(stockPrice.containsKey("Oracle"));
		System.out.println(stockPrice.containsValue(73));

		System.out.println("HashMap Keys:");
		Set<String> keys = stockPrice.keySet();
		for (String key : keys) {
			System.out.print(key + " ");
		}

		System.out.println("\nHashMap Values:");
		Collection<Integer> values = stockPrice.values();
		for (Integer value : values) {
			System.out.print(value + " ");
		}
		System.out.println("");
		System.out.println(stockPrice.isEmpty());

	}

}
