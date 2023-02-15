package P5_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemoComparable2 {
	public static void main(String[] args) {
		List<Employee2> list = new ArrayList<>();
		list.add(new Employee2("Jane", 29));
		list.add(new Employee2("Alex", 54));
		list.add(new Employee2("Matt", 19));
		list.add(new Employee2("Roy", 72));

		Collections.sort(list);
		for (Employee2 emp : list) {
			System.out.println("Employee Name: " + emp.name + " , Employee Age: " + emp.age);
		}
	}
}

class Employee2 implements Comparable<Employee2> {
	String name;
	int age;

	public Employee2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee2 emp) {
		// TODO Auto-generated method stub
		return (this.age - emp.age);
	}
}
