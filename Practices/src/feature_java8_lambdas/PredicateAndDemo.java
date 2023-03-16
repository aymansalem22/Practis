package feature_java8_lambdas;

import java.util.function.Predicate;

public class PredicateAndDemo {

	static boolean isPersonEligibleForMembership(Person person, Predicate<Person> predicate) {
		return predicate.test(person);
	}

	public static void main(String[] args) {
		Person firstPerson = new Person("Alex", 23);
		Person secondPerson = new Person("Alex", 65);
		Predicate<Person> greaterThanEightteen = (p) -> p.age > 18;
		Predicate<Person> lessThanSixty = (p) -> p.age < 60;
		Predicate<Person> predicate = greaterThanEightteen.and(lessThanSixty);
		boolean eligible = isPersonEligibleForMembership(firstPerson, predicate);
		boolean eligible2 = isPersonEligibleForMembership(secondPerson, predicate);
		System.out.println("Person is eligible for membership: " + eligible);
		System.out.println("Person is eligible for membership: " + eligible2);

	}

}
