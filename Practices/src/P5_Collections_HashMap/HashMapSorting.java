package P5_Collections_HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSorting {
	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(123, "Alex");
		employeeMap.put(342, "Ryan");
		employeeMap.put(143, "Joe");
		employeeMap.put(234, "Allen");
		employeeMap.put(432, "Roy");
		employeeMap.put(39, "Zidan");

		List<Integer> keyList = new ArrayList<>(employeeMap.keySet());
		Collections.sort(keyList);
		System.out.println(keyList);

		List<String> valuesList = new ArrayList<>(employeeMap.values());
		Collections.sort(valuesList);
		System.out.println(valuesList);
	}
}
