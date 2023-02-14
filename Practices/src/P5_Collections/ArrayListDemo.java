package P5_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

		list.add(4);
		System.out.println(list);

		list.add(1, 50);
		System.out.println(list);

		List<Integer> newList = new ArrayList<>();
		newList.add(150);
		newList.add(160);

		list.addAll(newList);
		System.out.println(list);

		List<Integer> secondeList = new ArrayList<>();
		secondeList.add(250);
		secondeList.add(360);

		list.addAll(7, secondeList);
		System.out.println(list);

	}

}
