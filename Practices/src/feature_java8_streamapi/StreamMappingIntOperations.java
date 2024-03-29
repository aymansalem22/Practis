package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamMappingIntOperations {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Dave");
		list.add("Joe");
		list.add("Ryan");
		list.add("Iyan");
		list.add("Ray");

		list.stream().mapToInt(name -> name.length()).forEach(System.out::println);
	}

}
