package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamMethodReferencesStatic {

	public static int getLength(String str) {
		return str.length();
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("done");
		list.add("word");
		list.add("practice");
		list.add("fake");

		// code without using method reference.(name of class and static method)
		list.stream().mapToInt(str -> StreamMethodReferencesStatic.getLength(str)).forEach(System.out::println);

		System.out.println("---------------------");

		// code with method reference.
		list.stream().mapToInt(StreamMethodReferencesStatic::getLength).forEach(System.out::println);
	}

}
