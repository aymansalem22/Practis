package P5_Collections_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteration {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(24);
		set.add(44);
		set.add(577);

		for (int i : set) {
			System.out.println(i);
		}

		System.out.println("-------------------");

		Set<Integer> newSet = new HashSet<>();
		newSet.add(27);
		newSet.add(73);
		newSet.add(122);

		Iterator<Integer> itr = newSet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-------------------");

		Set<Integer> newSet2 = new HashSet<>();
		newSet2.add(142);
		newSet2.add(156);
		newSet2.add(195);

		newSet2.forEach(System.out::println);
	}

}
