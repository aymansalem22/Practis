package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamMappingOperations {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Dave");
		list.add("Joe");
		list.add("Ryan");
		list.add("Iyan");
		list.add("Ray");

		list.stream().map(name -> name.toUpperCase()).forEach(System.out::println);

	}

}
