package feature_java8_lambdas;

import java.util.function.Function;

public class FunctionInterfaceDemo {
	public static void main(String[] args) {
		Function<String, Integer> lengthFunction = str -> str.length();
		System.out.println("String length: " + lengthFunction.apply("hello world"));
	}
}
