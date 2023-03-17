package feature_java8_lambdas;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorTest {
	public static void main(String[] args) {
		IntUnaryOperator operator = num -> num * num;
		System.out.println(operator.applyAsInt(20));

	}
}
