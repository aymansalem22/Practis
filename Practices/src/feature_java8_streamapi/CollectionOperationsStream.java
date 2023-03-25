package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionOperationsStream {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Alex", 23, 23000, "USA"));
		employeeList.add(new Employee("Ben", 63, 25000, "India"));
		employeeList.add(new Employee("Dave", 34, 56000, "Bhutan"));
		employeeList.add(new Employee("Jodi", 43, 67000, "China"));
		employeeList.add(new Employee("Ryan", 53, 54000, "Libya"));

		List<String> empName = employeeList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println(empName);

		System.out.println("Set -->");
		Set<String> empName2 = employeeList.stream().map(emp -> emp.getCountry()).collect(Collectors.toSet());
		System.out.println(empName2);

		System.out.println("Supplier -->");
		LinkedList<String> empName3 = employeeList.stream().map(emp -> emp.getName())
				.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(empName3);

		List<String> newList = new ArrayList<>();
		newList.add("done");
		newList.add("far");
		newList.add("away");
		newList.add("again");

		System.out.println("Map -->");
		Map<String, Integer> nameMap = newList.stream().collect(Collectors.toMap(s -> s, s -> s.length()));
		System.out.println(nameMap);

		System.out.println("Map Accept Duplicate with binary operator -->");

		List<String> newList2 = new ArrayList<>();
		newList2.add("done");
		newList2.add("far");
		newList2.add("away");
		newList2.add("done");

		Map<String, Integer> nameMap2 = newList2.stream()
				.collect(Collectors.toMap(s -> s, s -> s.length(), (s1, s2) -> s1));

		System.out.println(nameMap2);

		System.out.println("convert our stream to a HashMap -->");
		Map<String, Integer> nameMap3 = newList2.stream()
				.collect(Collectors.toMap(s -> s, s -> s.length(), (s1, s2) -> s1, HashMap::new));
		System.out.println(nameMap3);

		System.out.println("CollectingAndThen with unmodifiable List-->");
		List<String> unmodifiableList = newList2.stream()
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
		System.out.println(unmodifiableList);
	}

}
