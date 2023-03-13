package P5_Collections_Arrays;

import java.util.Arrays;

public class ArraysObjectsCopying {
	public static void main(String[] args) {
		Employee[] employees = { new Employee(123, "Jay"), new Employee(124, "Ryan") };
		Employee[] copiedArray = Arrays.copyOf(employees, 2);
		for (Employee employee : copiedArray) {
			System.out.println(employee + " ");
		}
		System.out.println();
		employees[0] = new Employee(123, "Changed Name");

		System.out.println(employees[0].empName);

		System.out.println(copiedArray[0].empName);

	}
}
