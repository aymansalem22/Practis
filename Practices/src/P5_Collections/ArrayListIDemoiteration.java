package P5_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIDemoiteration {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("\n-----------");
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

}
