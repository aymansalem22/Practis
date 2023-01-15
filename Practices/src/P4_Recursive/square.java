package P4_Recursive;
//Direct Recursion#

public class square {
	// recursive method to calculate square of a number
	private static int square(int n) {
		// Base case
		if (n == 0) {
			return 0;
		}

		// recursive case

		else {
			return square(n - 1) + (2 * n) - 1;
		}
	}

	public static void main(String[] args) {
		int input = 7;
		int output = square(input);
		System.out.println("The square of the number " + input + " is: " + output);
	}

}
