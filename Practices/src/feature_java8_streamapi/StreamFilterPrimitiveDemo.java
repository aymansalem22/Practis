package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterPrimitiveDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(12);
		list.add(23);
		list.add(45);
		list.add(6);

		list.stream().filter(num -> num > 10).forEach(System.out::println);

		System.out.println("\nOriginal list is not modified");
		list.stream().forEach(System.out::println);
	}

}
