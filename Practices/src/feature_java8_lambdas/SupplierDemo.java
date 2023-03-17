package feature_java8_lambdas;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {

	static boolean isPersonEligibleForVoting(Supplier<Person> supplier, Predicate<Person> predicate) {
		return predicate.test(supplier.get());
	}

	public static void main(String[] args) {
		Supplier<Person> supplier = () -> new Person("Alex", 23);
		Predicate<Person> predicate = (p) -> p.age > 18;
		boolean eligible = isPersonEligibleForVoting(supplier, predicate);
		System.out.println("Person is eligible for voting: " + eligible);
	}

}
