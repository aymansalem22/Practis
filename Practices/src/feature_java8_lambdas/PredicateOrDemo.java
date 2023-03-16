package feature_java8_lambdas;

import java.util.function.Predicate;

public class PredicateOrDemo {

	static boolean isPersonEligibleForRetirement(Person person, Predicate<Person> predicate) {
		return predicate.test(person);
	}

	public static void main(String[] args) {
		Person firstPerson = new Person("Alex", 70);
		Person secondPerson = new Person("Ali");
		secondPerson.setYearOfService(25);

		Predicate<Person> greaterThanSixty = (p) -> p.age > 60;

		Predicate<Person> serviceMoreThanThirty = (p) -> p.yearOfService > 30;

		Predicate<Person> predicate = greaterThanSixty.or(serviceMoreThanThirty);
		boolean eligible = isPersonEligibleForRetirement(firstPerson, predicate);
		System.out.println("Person is eligible for retirement: " + eligible);

		boolean eligible2 = isPersonEligibleForRetirement(secondPerson, predicate);
		System.out.println("Person is eligible for retirement: " + eligible2);

	}

}
