package P5_Collections_LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> stocks = new LinkedHashMap<>();
		stocks.put("Apple", 123);
		stocks.put("BMW", 54);
		stocks.put("Google", 87);
		stocks.put("Microsoft", 232);
		stocks.put("Oracle", 76);

		System.out.println(stocks);

		LinkedHashMap<String, Integer> newStocks = new LinkedHashMap<>(16, 0.75f, true);
		System.out.println("test");

		newStocks.put("Tesla", 432);
		newStocks.put("Nvidia", 300);
		newStocks.put("Toshipa", 31);
		System.out.println("compare by value");
		newStocks.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println(newStocks);
		newStocks.put("Acer", 988);
		newStocks.get("Nvidia");
		System.out.println(newStocks);

	}
}
