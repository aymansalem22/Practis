package feature_java8_lambdas;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> stringConsumer = s -> System.out.println(s);
		stringConsumer.accept("Hello World.");

		Consumer<Integer> intConsumer = s -> System.out.println(s);
		intConsumer.accept(5);

	}

}
