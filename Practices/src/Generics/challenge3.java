package Generics;

public class challenge3 {
	public static void main(String args[]) {
		Score<Integer> x = new Score<Integer>();
		Score<Integer> y = new Score<Integer>();
		Score<Double> z = new Score<Double>();

		System.out.println(x.counter);
		System.out.println(y.counter);
		System.out.println(z.counter);

	}
}

class Score<T> {
	T value;
	public int counter = 0;

	public Score() {
		counter++;
	}

	public Score(T v) {
		value = v;
		counter++;
	}

	public static <A, B, C> void MultipleTypesFunction(A x, B y, C z) {
		System.out.println(x + " is Type A");
		System.out.println(y + " is Type B");
		System.out.println(z + " is Type C");
	}
};

/*
 * 3 objects x,y and z are created. For each variable a new ‘count’ variable is
 * created and is incremented once.
 */
