package P5_Collections_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterator {
	public static void main(String[] args) {
		Map<String, Integer> stockPrice = new HashMap<>();
		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 123);

		Set<Entry<String, Integer>> entrySet = stockPrice.entrySet();
		Iterator<Entry<String, Integer>> itr = entrySet.iterator();

		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println("Company Name: " + entry.getKey() + " stockPrice: " + entry.getValue());
			if (entry.getKey().equals("Oracle")) {
				itr.remove();
			}
		}
		System.out.println(stockPrice);
	}

}
