package P4_Recursive;

public class Ex1 {
	public static int pow(int b, int p) {
		if (p == 0) {
			return 1;
		} else {
			return (b * pow(b, p - 1));
		}
	}

	public static void main(String[] args) {
		System.out.println(pow(2, 6));
	}

}
