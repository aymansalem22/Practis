package feature_java8_lambdas;

import java.util.function.Function;

public class CapturingLambdaDemo2 {
	public static void main(String[] args) {
		Function<Integer, Integer> multiplier = getMultiplier();
		System.out.println(multiplier.apply(10));
	}

	public static Function<Integer, Integer> getMultiplier() {
		int i = 5;
		Function<Integer, Integer> multiplier = t -> t * i;
		// i=7;
		return multiplier;
	}

}

/*
 * with -> i=7 CapturingLambdaDemo.java:16: error: local variables referenced
 * from a lambda expression must be final or effectively final Function<Integer,
 * Integer> multiplier = t -> t * i; ^ 1 error
 */
