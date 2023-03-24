package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MutableReductionStream {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Dave", 23, 2000));
		list.add(new Employee("Joe", 18, 2000));
		list.add(new Employee("Ryan", 54, 1000));
		list.add(new Employee("Iyan", 5, 4000));
		list.add(new Employee("Ray", 63, 6000));

		Optional<Integer> totalSalary = list.stream().map(p -> p.getSalary()).reduce((p, q) -> p + q);
		if (totalSalary.isPresent())
			System.out.println("The total salary is " + totalSalary.get());

		System.out.println("with sum in mapInt");

		int totalSalary2 = list.stream().mapToInt(p -> p.getSalary()).sum();

		System.out.println("The total salary is " + totalSalary2);

		System.out.println("--with reduce T identity");

		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

		int totalSum2 = list2.stream().reduce(5, (partialSum, num) -> partialSum + num);
		System.out.println("Total Sum is " + totalSum2);

		System.out.println("parallelStream-->");
		int totalSum3 = list2.parallelStream().reduce(0, (partialSum, num) -> partialSum + num, Integer::sum);
		System.out.println("Total Sum is " + totalSum3);

		System.out.println("max and min with comparator--> ");
		Optional<Integer> max = list2.stream().max(Comparator.naturalOrder());
		System.out.println("Max value is " + max.get());

		Optional<Integer> min = list2.stream().min(Comparator.naturalOrder());
		System.out.println("Min value is " + min.get());

	}

}
