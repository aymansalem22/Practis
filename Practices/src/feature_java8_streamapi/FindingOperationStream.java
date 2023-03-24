package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingOperationStream {
	public static void main(String[] args) {
		List<newPerson> list = new ArrayList<>();
		list.add(new newPerson("Dave", 23, "India"));
		list.add(new newPerson("Joe", 18, "USA"));
		list.add(new newPerson("Ryan", 54, "Canada"));
		list.add(new newPerson("Iyan", 5, "India"));
		list.add(new newPerson("Ray", 63, "China"));

		Optional<newPerson> person = list.stream().filter(p -> p.getCountry().equals("India")).findFirst();

		if (person.isPresent()) {
			System.out.println(person);
		}

		Optional<newPerson> secondPerson = list.stream().filter(p -> p.getCountry().equals("India")).findAny();
		if (secondPerson.isPresent()) {
			System.out.println(secondPerson);
		}
	}

}
