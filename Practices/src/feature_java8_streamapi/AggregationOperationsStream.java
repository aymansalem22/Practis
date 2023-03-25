package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregationOperationsStream {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Alex", 23, 23000));
		employeeList.add(new Employee("Ben", 63, 25000));
		employeeList.add(new Employee("Dave", 34, 56000));
		employeeList.add(new Employee("Jodi", 43, 67000));
		employeeList.add(new Employee("Ryan", 53, 54000));

		Long count = employeeList.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.counting());
		System.out.println(count);

		int countSum = employeeList.stream().collect(Collectors.summingInt(emp -> emp.getSalary()));
		System.out.println(countSum);

		double average = employeeList.stream().collect(Collectors.averagingInt(emp -> emp.getSalary()));
		System.out.println(average);

		Optional<Employee> employee = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(employee.get().getName());

		Optional<Employee> maxEmployee = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(maxEmployee.get().getName());

		IntSummaryStatistics summarizingInt = Stream.of("1", "2", "3")
				.collect(Collectors.summarizingInt(Integer::parseInt));
		System.out.println(summarizingInt);

		System.out.println("joining()-->");

		String joinedString = Stream.of("hello", "how", "are", "you").collect(Collectors.joining());
		System.out.println(joinedString);

		joinedString = Stream.of("hello", "how", "are", "you").collect(Collectors.joining(" "));
		System.out.println(joinedString);

		joinedString = Stream.of("hello", "how", "are", "you").collect(Collectors.joining(" ", "prefix", "suffix"));
		System.out.println(joinedString);

	}

}
