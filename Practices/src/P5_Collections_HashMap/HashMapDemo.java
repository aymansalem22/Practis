package P5_Collections_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> stockPrice = new HashMap<>();

		stockPrice.put("Oracle", 56);
		System.out.println(stockPrice);

		stockPrice.put("Oracle", 60);
		System.out.println(stockPrice);

		stockPrice.putIfAbsent("Oracle", 70);
		System.out.println(stockPrice);

	}

}
