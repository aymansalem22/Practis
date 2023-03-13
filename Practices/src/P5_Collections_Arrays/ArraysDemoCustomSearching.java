package P5_Collections_Arrays;

import java.util.Arrays;

public class ArraysDemoCustomSearching {
	public static void main(String[] args) {
		Employee[] employees = { new Employee(123, "Jay"), new Employee(124, "Roy"), new Employee(125, "Nikki"),
				new Employee(126, "Tom") };

		int index = Arrays.binarySearch(employees, new Employee(124, "Roy"), (emp1, emp2) -> emp1.empId - emp2.empId);
		System.out.println("The index of employee object in the array is " + index);
	}
}
