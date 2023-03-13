package P5_Collections_CollectionsClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsCopying {
	public static void main(String[] args) {
		List<Integer> dest = Arrays.asList(10, 20, 30, 40, 50, 60);
		List<Integer> src = Arrays.asList(1, 2, 3);

		Collections.copy(dest, src);
		// replaces the elements
		System.out.println(dest);

	}

}
