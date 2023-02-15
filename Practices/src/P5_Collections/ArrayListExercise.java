package P5_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListExercise {

	public static void main(String args[]) {
		List<NewEmployee5> list = new ArrayList<>();
		list.add(new NewEmployee5("Alex", 23, "USA"));
		list.add(new NewEmployee5("Dave", 34, "India"));
		list.add(new NewEmployee5("Carl", 21, "USA"));
		list.add(new NewEmployee5("Joe", 56, "Russia"));
		list.add(new NewEmployee5("Amit", 64, "China"));
		list.add(new NewEmployee5("Ryan", 19, "Brazil"));
		list.add(new NewEmployee5("David", 39, "Spain"));
		System.out.println("Name of employees with age more than 50");
		for (NewEmployee5 employee : list) {
			if (employee.age > 50) {
				System.out.println("Employee " + employee.name);
			}
		}

		System.out.println("**Solutions with streams**\nName of employees with age more than 50");
		list.stream().filter(emp -> emp.age > 50).map(emp -> emp.name).forEach(System.out::println);

		System.out.println("Using for :\nRemoving the employees residing in USA from the List");
		for (Iterator<NewEmployee5> iterator = list.iterator(); iterator.hasNext();) {
			if (iterator.next().country.equals("USA")) {
				iterator.remove();
			}

		}

		for (NewEmployee5 newEmployee5 : list) {
			System.out.println("Employee Name: " + newEmployee5.name + ", Employee Country: " + newEmployee5.country);
		}

		System.out.println("Using while :\nRemoving the employees residing in USA from the List");
		Iterator<NewEmployee5> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			if (iterator2.next().country.equals("Spain")) {
				iterator2.remove();
			}
		}
		for (NewEmployee5 newEmployee6 : list) {
			System.out.println("Employee Name: " + newEmployee6.name + ", Employee Country: " + newEmployee6.country);
		}

		System.out.println("Sorting all the employees by country name");
		Collections.sort(list, (e1, e2) -> e1.country.compareTo(e2.country));
		for (NewEmployee5 emp : list) {
			System.out.println("Employee Name: " + emp.name + ", Employee Country: " + emp.country);
		}

	}

}

class NewEmployee5 {

	String name;
	Integer age;
	String country;

	public NewEmployee5(String name, Integer age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}

}
