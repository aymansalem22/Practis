package feature_java8_lambdas;

import java.util.function.Predicate;

public class PredicateNegateDemo {

	static boolean isNumberLessThanTen(Predicate<Integer> predicate) {
		return predicate.negate().test(14);
	}

	public static void main(String[] args) {
		Predicate<Integer> numberGreaterThanTen = p -> p > 10;
		boolean isLessThanTen = isNumberLessThanTen(numberGreaterThanTen);
		System.out.println("Is number less than ten: " + isLessThanTen);
	}

}
