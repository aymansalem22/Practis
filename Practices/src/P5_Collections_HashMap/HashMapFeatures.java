package P5_Collections_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapFeatures {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("India", 5);
		map.put("USA", 3);
		map.put("China", 5);
		map.put("Russia", 6);

		map.compute("India", (k, v) -> v == null ? 10 : v + 1);
		System.out.print(map + " ");
		System.out.println(" ");
		map.compute("Vietnam", (k, v) -> v == null ? 10 : v + 1);
		System.out.print(map + " ");
	}

}
