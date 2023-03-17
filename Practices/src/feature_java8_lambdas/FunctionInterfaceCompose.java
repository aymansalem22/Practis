package feature_java8_lambdas;

import java.util.function.Function;

public class FunctionInterfaceCompose {
	public static void main(String[] args) {
		Function<Integer, Integer> increment = x -> x + 10;
		Function<Integer, Integer> multiply = y -> y * 2;
		System.out.println(increment.compose(multiply).apply(3));

		System.out.println(increment.andThen(multiply).apply(3));

	}
}
