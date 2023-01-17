package P4_Recursive;

//iterative and recursive code 
public class Concept {

	public static void main(String[] args) {
		int result = concept1.factorialIterative(7);
		System.out.println("with Iterative " + "The factorial is: " + result);
		System.out.println("******");
		int result2 = concept2.factorialRecursive(7);
		System.out.println("The factorial is: " + result2);

	}

	class concept1 {
		private static int factorialIterative(int n) {
			int factorialResult = 1;
			for (int i = 1; i <= n; i++) {
				factorialResult = factorialResult * i;
			}
			return factorialResult;
		}
	}

	class concept2 {
		private static int factorialRecursive(int n) {
			if (n == 1) {
				return 1;
			} else {
				return (n * factorialRecursive(n - 1));
			}
		}
	}
}