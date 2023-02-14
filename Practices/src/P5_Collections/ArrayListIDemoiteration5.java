package P5_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

////java.util.ConcurrentModificationException(add!!)
public class ArrayListIDemoiteration5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(45);

		Iterator<Integer> itr = list.iterator();
		list.add(45);

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
