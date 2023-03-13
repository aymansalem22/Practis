package P5_Collections_ConcurrentHashMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> stocks = new ConcurrentHashMap<>();
		stocks.put("Google", 123);
		stocks.put("Microsoft", 654);
		stocks.put("Apple", 345);
		stocks.put("Tesla", 9988);

		System.out.println(stocks);

		stocks.putIfAbsent("Apple", 1000);
		System.out.println(stocks);

		System.out.println("Iteration");
		Iterator<Entry<String, Integer>> itr = stocks.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println("Company Name: " + entry.getKey() + " stockPrice: " + entry.getValue());

			if (entry.getKey().equals("Tesla")) {
				itr.remove();
			}
			stocks.put("Tesla2", 99884);
		}

		System.out.println(stocks);

	}

}
