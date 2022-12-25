package defaultMethod;

public class Anotationes {
	@FunctionalInterface
	public interface Functional {
		void doSomething();

		// generarte error!! only one abstract method with annotation
		// @FunctionalInterface
		// void doSomething2();

		default void foo() {
			System.out.println("foo");
		}
	}

	public static void main(String[] args) {

	}

}
