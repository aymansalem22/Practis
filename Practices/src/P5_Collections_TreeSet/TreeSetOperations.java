package P5_Collections_TreeSet;

import java.util.TreeSet;

public class TreeSetOperations {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		System.out.println("Checking if TreeSet is empty: " + set.isEmpty());
		System.out.println("Checking if TreeSet size: " + set.size());
		System.out.println("Checking if TreeSet contains 44: " + set.contains(44));

		set.add(21);
		set.add(32);
		set.add(44);
		set.add(11);

		System.out.println("Checking if TreeSet is empty: " + set.isEmpty());
		System.out.println("Checking the TreeSet size: " + set.size());
		System.out.println("Checking if TreeSet contains 44: " + set.contains(44));

	}
}
