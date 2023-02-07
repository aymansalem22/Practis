package P4_Recursive;

public class Ex2 {
	public static void recursiveFunc(int n) {
		if (n == 0) {
			System.out.println("False");
			return;
		}
		if (n == 1) {
			System.out.println("True");
			return;
		}
		if (n % 2 == 0) {
			recursiveFunc(n / 2);
		} else {
			System.out.println("False");
			return;
		}
	}

	public static void main(String[] args) {
		recursiveFunc(64);
	}
}
