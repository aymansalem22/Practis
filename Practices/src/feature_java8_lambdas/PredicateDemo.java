package feature_java8_lambdas;

import java.util.function.Predicate;

public class PredicateDemo {

	static boolean isPersonalEligibleForVoting(Person person, Predicate<Person> predicate) {
		return predicate.test(person);
	}

	public static void main(String[] args) {
		Person person = new Person("Alex", 23);
		Person person2 = new Person("Alex", 17);
		Predicate<Person> predicate = p -> p.age > 18;
		boolean eligible = isPersonalEligibleForVoting(person, predicate);
		boolean eligible2 = isPersonalEligibleForVoting(person2, predicate);
		System.out.println("Person is eligible for voting: " + eligible);
		System.out.println("Person is eligible for voting: " + eligible2);
	}

}
