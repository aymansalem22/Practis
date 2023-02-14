package P5_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemoOperation2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");

		list.replaceAll((element) -> element.toUpperCase());

		System.out.println(list);

		List<Double> newlist = new ArrayList<>();
		newlist.add(1.6);
		newlist.add(6.4);
		newlist.replaceAll((element) -> element.MIN_VALUE);
		System.out.println(newlist);
	}
}
