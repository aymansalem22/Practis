package feature_java8_lambdas;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("John", 23, "USA"));
		persons.add(new Person("Carl", 23, "Australia"));
		persons.add(new Person("Amit", 23, "India"));
		persons.add(new Person("Vikram", 23, "Bhutan"));
		persons.add(new Person("Kane", 23, "Brazil"));

		List<Person> sortedPerson = PersonService.getPersonByLambda(persons);
		System.out.println("Person after sorted");
		for (Person person : sortedPerson) {
			System.out.println("Person Name : " + person.getName());
		}

	}

}
