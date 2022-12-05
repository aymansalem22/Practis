package P1;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println("The element at index two is "+list.get(1));
		System.out.println("This size of the list is "+list.size());

	}

}
