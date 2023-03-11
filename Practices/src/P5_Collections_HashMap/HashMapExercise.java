package P5_Collections_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExercise {
	public static void main(String[] args) {
		Map<String, Integer> stockPrice = new HashMap<>();
		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 213);
		stockPrice.put("Google", 421);
		stockPrice.put("Ford", 456);
		stockPrice.put("Novartis", 43);
		stockPrice.put("TCS", 23);

		int max = 0;
		String company = "";

		for (Entry<String, Integer> entry : stockPrice.entrySet()) {
			if (entry.getValue() > max) {
				company = entry.getKey();
				max = entry.getValue();
			}

		}

		System.out.println("Company with max stock price is: " + company);

		Collection<Integer> values = stockPrice.values();

		int sum = 0;

		for (int i : values) {
			sum += i;
		}

		System.out.println("The average stock price is " + sum / values.size());

		Iterator<Entry<String, Integer>> itr = stockPrice.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();

			if (entry.getValue() < 50) {
				itr.remove();
			}
		}

		System.out.println("Remove companies with stock price below 50: " + stockPrice);
	}
}
