package P5_Collections_CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListThreadSafe {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		List<String> synlist = Collections.synchronizedList(list);

		Iterator<String> itr = synlist.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}
}
