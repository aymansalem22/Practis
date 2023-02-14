package P5_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println("The elemnt at index two is " + list.get(0));
		System.out.println("The elemnt at index two is " + list.get(1));
		System.out.println("The size of the list is " + list.size());
	}

}
