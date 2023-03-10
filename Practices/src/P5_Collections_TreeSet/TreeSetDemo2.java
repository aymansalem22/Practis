package P5_Collections_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(21);
		set.add(32);
		set.add(44);
		set.add(11);
		set.add(54);
		System.out.println("TreeSet elements in ascending order " + set);

		TreeSet<Integer> reverseSet = new TreeSet<>(set.descendingSet());
		System.out.println("TreeSet elements in descending order " + reverseSet);

		System.out.println("\n-----------------");

		TreeSet<Integer> reverseSet2 = new TreeSet<>(Comparator.reverseOrder());
		reverseSet2.add(11);
		reverseSet2.add(6);
		reverseSet2.add(-7);
		reverseSet2.add(40);

		System.out.println("TreeSet elements in descending order " + reverseSet2);

	}

}
