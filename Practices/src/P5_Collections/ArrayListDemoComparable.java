package P5_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//will not compile as the Employee class does not implement the Comparable interface.
public class ArrayListDemoComparable {
	public static void main(String[] args) {
		List<Employee5> list = new ArrayList<>();
		list.add(new Employee5("Jane", 29));
		list.add(new Employee5("Alex", 54));

		// Collections.sort(list);
		System.out.println("ArrayList in asc order: " + list);
	}

}

class Employee5 {
	String name;
	int age;

	public Employee5(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}