package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class GroupingOperationsStream {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Alex", 23, 23000, "USA"));
		employeeList.add(new Employee("Ben", 63, 25000, "China"));
		employeeList.add(new Employee("Dave", 34, 56000, "India"));
		employeeList.add(new Employee("Jodi", 43, 67000, "USA"));
		employeeList.add(new Employee("Ryan", 53, 54000, "China"));

		Map<String, List<Employee>> employeeMap = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getCountry));
		System.out.println(employeeMap);

		System.out.println("Set of Employees-->");
		Map<String, Set<Employee>> employeeMapSet = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getCountry, Collectors.toSet()));
		System.out.println(employeeMapSet);

		System.out.println("Multiple groups criterion -->");
		Map<String, Map<Integer, List<Employee>>> employeeMapGroups = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getCountry, Collectors.groupingBy(Employee::getAge)));
		System.out.println(employeeMapGroups);

		System.out.println("-------sum by country------------");
		Map<String, Integer> employeeMapSum = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getCountry, Collectors.summingInt(Employee::getSalary)));
		System.out.println(employeeMapSum);

		System.out.println("------Max value salary by country----");
		Map<String, Optional<Employee>> employeeMapMax = employeeList.stream().collect(Collectors
				.groupingBy(Employee::getCountry, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));

		System.out.println(employeeMapMax);

		System.out.println("---------Return map---------");
		Map<String, Set<Employee>> employeeMapSetV2 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getCountry, HashMap::new, Collectors.toSet()));

		System.out.println(employeeMapSetV2);

		System.out.println("----ConcurrentMap--------");

		ConcurrentMap<String, List<Employee>> employeeMapConcurent = employeeList.parallelStream()
				.collect(Collectors.groupingByConcurrent(Employee::getCountry));

		System.out.println(employeeMapConcurent);

		System.out.println("-----partition the employees---");
		Map<Boolean, List<Employee>> employeeMapPart = employeeList.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getAge() > 30));

		System.out.println(employeeMapPart);

	}

}
