package feature_java8_lambdas;

import java.util.function.Predicate;

public class PredicateisEqualDemo {

	public static void main(String[] args) {
		Predicate<String> predicate = Predicate.isEqual("Hello");
		System.out.println(predicate.test("Welcome"));
	}

}
