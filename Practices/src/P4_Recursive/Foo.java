package P4_Recursive;

public class Foo {
	public static int foo(int n) {
		if (n == 12) {
			return n;
		} else {
			return foo(n + 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(foo(3));
	}

}
