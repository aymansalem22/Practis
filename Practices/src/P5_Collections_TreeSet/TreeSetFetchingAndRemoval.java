package P5_Collections_TreeSet;

import java.util.TreeSet;

public class TreeSetFetchingAndRemoval {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(21);
		set.add(32);
		set.add(44);
		set.add(11);
		set.add(54);
		set.add(3);
		set.add(9);
		set.add(41);

		System.out.println("Fetching the first element in TreeSet " + set.first());
		System.out.println("Fetching the last elemnt in TreeSet " + set.last());
		System.out.println("Fetching all the elements less than 40 " + set.headSet(40));
		System.out.println("Fetching all the elements greater than 40 " + set.tailSet(40));

		TreeSet<Integer> setDemo = new TreeSet<>();
		setDemo.add(21);
		setDemo.add(32);
		setDemo.add(44);
		setDemo.add(11);
		setDemo.add(54);
		setDemo.add(3);
		setDemo.add(9);
		setDemo.add(41);

		System.out.println("Removing 44 from TreeSet " + set.remove(44));

		System.out.println("Removing 44 from TreeSet " + set.remove(100));

	}

}
