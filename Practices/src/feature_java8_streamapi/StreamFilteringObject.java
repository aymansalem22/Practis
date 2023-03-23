package feature_java8_streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamFilteringObject {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Ali", 23));
		list.add(new Person("Joe", 18));
		list.add(new Person("Ryan", 54));
		list.add(new Person("Iyan", 5));
		list.add(new Person("Ray", 63));
		list.add(new Person("", 33));

		list.stream().filter(person -> person.getAge() > 18 && person.getAge() < 60)
				.filter(person -> person.getName() != null && !person.getName().isEmpty()).forEach(System.out::println);

		System.out.println("with single filter ==filter() chaining");

		list.stream().filter(person -> person.getName() != null).filter(person -> person.getAge() > 18)
				.filter(person -> person.getAge() < 60).forEach(System.out::println);

	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
