package P5_Collections_TreeMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, Integer> reverseMap = new TreeMap<>(Comparator.reverseOrder());
		reverseMap.put("Oracle", 43);
		reverseMap.put("Microsoft", 56);
		reverseMap.put("Apple", 43);
		reverseMap.put("Novartis", 87);
		System.out.println("Elements are stored in reverse order: " + reverseMap);

		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Oracle", 45);
		hashMap.put("Microsft", 56);
		hashMap.put("Apple", 43);
		hashMap.put("Novartis", 87);
		System.out.println("Elements are stored in random order: " + hashMap);

		TreeMap<String, Integer> treeMap1 = new TreeMap<>(hashMap);
		System.out.println("Elements are stored in asending order: " + treeMap1);

		TreeMap<String, Integer> treeMap2 = new TreeMap<>(reverseMap);
		System.out.println("Elements are stored in desending order: " + treeMap2);
	}
}
