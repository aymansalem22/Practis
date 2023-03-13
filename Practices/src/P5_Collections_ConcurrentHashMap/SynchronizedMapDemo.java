package P5_Collections_ConcurrentHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//ConcurrentModificationException
public class SynchronizedMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Udemy");
		map.put(2, "Eductaive");

		Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
		Iterator<Entry<Integer, String>> iterator = synchronizedMap.entrySet().iterator();
		while (iterator.hasNext()) {
			synchronizedMap.put(3, "Modification");
			iterator.next();
		}
	}

}
