package feature_java8_lambdas;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	static boolean isPersonalEligibleForVoting(Person person, Integer minAge, BiPredicate<Person, Integer> predicate) {
		return predicate.test(person, minAge);
	}

	public static void main(String[] args) {
		Person person = new Person("Alex", 23);
		boolean eligible = isPersonalEligibleForVoting(person, 18, (p, minAge) -> {
			return p.age > minAge;
		});
		System.out.println("Person is eligible for voting: " + eligible);
	}

}
