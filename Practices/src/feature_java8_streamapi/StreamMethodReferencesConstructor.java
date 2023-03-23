package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamMethodReferencesConstructor {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Dave");
		list.add("Joe");
		list.add("Ryan");
		list.add("Iyan");
		list.add("Ray");

		System.out.println("code without constructor reference");
		list.stream().map(name -> new Employee(name)).forEach(System.out::println);

		System.out.println("code with constructor reference");

		list.stream().map(Employee::new).forEach(System.out::println);

	}
}
