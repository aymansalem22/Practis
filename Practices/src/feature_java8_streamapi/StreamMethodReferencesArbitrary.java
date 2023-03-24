package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamMethodReferencesArbitrary {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Dave", 23, 20000));
		list.add(new Employee("Joe", 18, 40000));
		list.add(new Employee("Ryan", 54, 100000));
		list.add(new Employee("Iyan", 5, 34000));
		list.add(new Employee("Ray", 63, 54000));

		System.out.println("code Without using method reference");
		int totalSalary1 = list.stream().mapToInt(emp -> emp.getSalary()).sum();
		System.out.println("The total salary is " + totalSalary1);

		System.out.println("code With  method reference");
		int totalSalary = list.stream().mapToInt(Employee::getSalary).sum();

		System.out.println("The total salary is " + totalSalary);

	}

}

class Employee {
	String name;
	int age;
	int salary;

	public Employee(String name) {
		super();
		this.name = name;
	}

	Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public Optional<Integer> getSalary_v2() {
		return Optional.of(salary);
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
	}
}