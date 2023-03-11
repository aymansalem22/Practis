package P5_Collections_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> stockPrice = new HashMap<>();
		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 213);

		System.out.println(stockPrice.get("Oracle"));
		System.out.println(stockPrice.get("Google"));

		System.out.println(stockPrice.getOrDefault("BMW", 100));
		System.out.println(stockPrice.getOrDefault("Google", 166));

	}
}
