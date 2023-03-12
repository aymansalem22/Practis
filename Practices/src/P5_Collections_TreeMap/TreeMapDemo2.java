package P5_Collections_TreeMap;

import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Oracle", 43);
		map.put("Microsoft", 56);
		map.put("Apple", 43);
		map.put("Novartis", 87);

		System.out.println(map);

		TreeMap<String, Integer> finalMap = new TreeMap<>();
		map.put("Google", 65);
		map.put("Audi", 32);
		finalMap.putAll(map);

		System.out.println(finalMap);

	}
}
