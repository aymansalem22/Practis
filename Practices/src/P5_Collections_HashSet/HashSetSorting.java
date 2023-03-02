package P5_Collections_HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetSorting {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(87);
		set.add(99);
		set.add(62);

		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		list.forEach(System.out::println);

	}

}
