package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		// a) Stream.of(v1, v2, v3….)
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));

		// b) List.stream()
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		Stream<String> stream1 = list.stream();
		stream1.forEach(p -> System.out.println(p));

	}
}
