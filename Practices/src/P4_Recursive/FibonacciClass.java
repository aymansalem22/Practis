package P4_Recursive;

public class FibonacciClass {
	public static int fibonacci(int n) {
		// Base case
		if (n <= 1) {
			return n;
		}
		// Recursive case
		else {
			return (fibonacci(n - 1) + fibonacci(n - 2));
		}
	}

	public static void main(String[] args) {
		int input = 8;
		System.out.println("Fibonacci sequence for the first " + input + " element is:");

		int i = 0;
		while (i < input) {
			System.out.print(fibonacci(i) + " ");
			i++;
		}
	}

}
