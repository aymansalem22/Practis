package P5_Collections_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo3 {
	public static void main(String[] args) {
		Map<String, Integer> stockPrice = new HashMap<>();
		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 213);

		System.out.println(stockPrice.replace("Oracle", 70, 76));
		System.out.println(stockPrice.get("Oracle"));

		System.out.println(stockPrice.replace("Oracle", 56, 76));
		System.out.println(stockPrice.get("Oracle"));

		stockPrice.replace("Fiserv", 100);
		System.out.println(stockPrice.get("Fiserv"));

		stockPrice.replaceAll((k, v) -> v + 10);
		System.out.println(stockPrice);

	}

}
