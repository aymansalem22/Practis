package P5_Collections_HashSet;

import java.util.HashSet;
import java.util.Set;

public class NewHashSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		System.out.println("Inserting 23 in the HashSet: " + set.add(23));
		System.out.println("Inserting 34 in the HashSet: " + set.add(34));
		System.out.println("Inserting 23 in the HashSet: " + set.add(23));

		System.out.println(set);

		// Fetching an element from a HashSet#

		System.out.println(set.contains(23));
		System.err.println("-----------------");
		// HashSet: Operations
		Set<Integer> newSet = new HashSet<>();
		newSet.add(24);
		newSet.add(36);
		newSet.add(56);

		newSet.remove(24);

		System.out.println("HashSet after removing one elemnt" + newSet);

		newSet.clear();

		System.out.println("HashSet after removing all elemnts" + newSet);

		System.err.println("-----------------");

		// Checking if the HashSet is empty

		Set<Integer> secondSet = new HashSet<>();
		secondSet.add(27);
		secondSet.add(67);
		secondSet.add(86);

		System.out.println(secondSet.isEmpty());

	}
}
