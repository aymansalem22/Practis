package P2;

// Playing With Strings
public class Example3 {
	public static void main(String[] args) {
		String odd = "Hello";
		String even = "John";
		System.out.println("Hello: " + test(odd));
		System.out.println("John: " + test(even));
	}

	public static String test(String x) {
		if (x.length() % 2 == 0) {
			return x.toUpperCase();
		}
		return x.toLowerCase();

	}

}
