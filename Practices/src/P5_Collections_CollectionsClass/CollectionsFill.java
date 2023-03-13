package P5_Collections_CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFill {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(45);

		Collections.fill(list, 10);
		System.out.println(list);

	}

}
