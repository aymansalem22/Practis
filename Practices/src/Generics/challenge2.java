package Generics;

public class challenge2 {

	public static void main(String args[]) {
		System.out.println(GetMax.maximum(4, 6));
		System.out.println(GetMax.maximum(4.0, 6.1));
		// System.out.println(GetMax.maximum(4, 6.7));
	}
}

class GetMax {
	public static <T extends Comparable<T>> T maximum(T a, T b) {
		if (a.compareTo(b) > 0)
			return a;
		else
			return b;
	}
}

/*
 * '// System.out.println(GetMax.maximum(4, 6.7)); 'didn't work bc The last call
 * to maximum passes an int as first argument and a double as the second
 * argument hence compiler error will occur
 */
