package feature_java8_lambdas;

import java.util.function.UnaryOperator;

public class CapturingLambdaDemo {
	static int t = 4;

	public static void main(String[] args) {
		int i = 5;
		// i = 7; // effectively final
		UnaryOperator<Integer> operator = (input) -> input * i;
		System.out.println(operator.apply(i));

		t = 7;// variable is reassigned, but it is not a local variable.
		UnaryOperator<Integer> operator2 = (input) -> input * t;
		System.out.println(operator2.apply(t));

	}

}
