package feature_java8_streamapi;

import java.util.Optional;

public class StreamOptionalMapping {
	public static void main(String[] args) {
		Optional<Employee> optional = Optional.of(new Employee("Adam", 56, 9000));
		optional.map(emp -> emp.getSalary()).filter(sal -> sal > 1000).ifPresent(System.out::println);

		System.out.println("FlatMap--->");

		Optional<Employee> optional2 = Optional.of(new Employee("Alan", 44, 12000));
		optional2.flatMap(emp -> emp.getSalary_v2()).filter(sal -> sal > 10000).ifPresent(System.out::println);

	}
}
