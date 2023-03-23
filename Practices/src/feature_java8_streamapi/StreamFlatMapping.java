package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapping {
	public static void main(String[] args) {
		List<List<String>> list = new ArrayList<>();
		list.add(Arrays.asList("a", "b", "c"));
		list.add(Arrays.asList("d", "e", "f"));
		list.add(Arrays.asList("g", "h", "i"));
		list.add(Arrays.asList("j", "k", "l"));

		System.out.println("will not print anythink");
		Stream<List<String>> stream1 = list.stream();
		Stream<List<String>> stream2 = stream1.filter(x -> "a".equals(x.toString()));
		stream2.forEach(System.out::println);

		System.out.println("with flatMap-->");
		Stream<List<String>> stream3 = list.stream();
		Stream<String> stream4 = stream3.flatMap(s -> s.stream());
		Stream<String> stream5 = stream4.filter(x -> "a".equals(x));
		stream5.forEach(System.out::println);

		System.out.println("Another way:-->");
		list.stream().flatMap(s -> s.stream()).filter(a -> "c".equals(a)).forEach(System.out::println);

	}

}
