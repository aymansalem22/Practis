package P3;

//Find the Maximum Value
public class MaxValue {
	public static void main(String[] args) {
		int[] arr = { -41, -55, -80, -63 };
		System.out.println("The maximum value in an array is: " + findMaxVal(arr));

	}

	public static int findMaxVal(int[] arr) {
		int a = arr[0];
		for (int i = 0; i < arr.length; i++) {

			a = arr[i] > a ? arr[i] : a;

		}
		return a;
	}
}
