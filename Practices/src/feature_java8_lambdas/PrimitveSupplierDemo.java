package feature_java8_lambdas;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

public class PrimitveSupplierDemo {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> (int) (Math.random() * 10);
		System.out.println(intSupplier.getAsInt());

		DoubleSupplier doubleSupplier = () -> (int) (Math.random() * 10);
		System.out.println(doubleSupplier.getAsDouble());
	}

}
