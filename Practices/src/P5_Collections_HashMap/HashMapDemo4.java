package P5_Collections_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo4 {

	public static void main(String[] args) {
		Map<String, Integer> stockPrice = new HashMap<>();
		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 213);

		System.out.println(stockPrice.remove("Oracle"));
		System.out.println(stockPrice);

		System.out.println(stockPrice.remove("Google"));

		System.out.println(stockPrice.remove("BMW", 80));

	}
}
