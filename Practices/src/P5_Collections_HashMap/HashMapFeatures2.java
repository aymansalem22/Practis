package P5_Collections_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapFeatures2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("India", 5);
		map.put("USA", 3);
		map.put("China", 5);
		map.put("Russia", 6);

		map.computeIfAbsent("Vietnam", k -> k.length());
		System.out.println(map);

		System.out.println(map.computeIfAbsent("USA", k -> 4));// didn't change any think bc its key present!!

		System.out.println(map);
	}

}
