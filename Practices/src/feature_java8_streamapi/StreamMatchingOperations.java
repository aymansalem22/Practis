package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamMatchingOperations {

	public static void main(String[] args) {
		List<newPerson> list = new ArrayList<>();
		list.add(new newPerson("Dave", 23, "India"));
		list.add(new newPerson("Joe", 18, "USA"));
		list.add(new newPerson("Ryan", 54, "Canada"));
		list.add(new newPerson("Iyan", 5, "India"));
		list.add(new newPerson("Ray", 63, "China"));

		boolean anyCandian = list.stream().anyMatch(p -> p.getCountry().equals("Canada"));
		System.out.println("Is there any resident of Canada: " + anyCandian);

		boolean allIsCandian = list.stream().allMatch(p -> p.getCountry().equals("Canada"));
		System.out.println("Are all persons canadian: " + allIsCandian);

		boolean anyRussian = list.stream().noneMatch(p -> p.getCountry().equals("Russia"));
		System.out.println(anyRussian);

	}

}

class newPerson {
	String name;
	int age;
	String country;

	newPerson(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

}
