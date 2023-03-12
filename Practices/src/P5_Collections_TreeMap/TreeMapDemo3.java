package P5_Collections_TreeMap;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo3 {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Oracle", 43);
		map.put("Microsoft", 56);
		map.put("Apple", 76);
		map.put("Novartis", 87);

		Entry<String, Integer> firstEntry = map.firstEntry();

		System.out.println("Smallest key: " + firstEntry.getKey() + ", Value: " + firstEntry.getValue());

		Entry<String, Integer> lastEntry = map.lastEntry();
		System.out.println("Largest key: " + lastEntry.getKey() + ", Value: " + lastEntry.getValue());
	}

}
