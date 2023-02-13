package P4_Recursive;

//Recursive Problem concept
public class ExampleClass2 {
	private static void printNum(int n) {
		// base case
		if (n == 0) {
			return;
		}

		// Recursive case
		printNum(n - 1);
		System.out.print(n + " ");

	}

	public static void main(String[] args) {
		printNum(6);
	}
}
