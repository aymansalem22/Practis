package P5_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//java.util.ConcurrentModificationException
public class ArrayListIDemoiteration3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			int next = itr.next();
			if (next == 30) {
				list.remove(new Integer(30));
			}
		}

	}
}
