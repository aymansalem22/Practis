package P4_Recursive;

public class Factorial {
	// Recursive function
	private static int factorial(int n) {
		// Base case
		if (n == 1) {
			return 1;
		}
		// Recursive case
		else {
			return (n * factorial(n - 1));
		}
	}

	public static void main(String args[]) {
		// Calling from main
		int result = factorial(6);
		System.out.println("Factorial of 6 is: " + result);
	}
}
