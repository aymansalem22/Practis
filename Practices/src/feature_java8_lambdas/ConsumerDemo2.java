package feature_java8_lambdas;

import java.util.function.Consumer;

public class ConsumerDemo2 {
	public static void main(String[] args) {
		Consumer<String> consumer1 = (arg) -> System.out.println(arg + "My name is Jane.");
		Consumer<String> consumer2 = (arg) -> System.out.println(arg + "I am from Canada.");
		consumer1.andThen(consumer2).accept("Well..");
	}

}
