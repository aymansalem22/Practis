package P3;

public class maxValueV2 {

	public static void main(String[] args) {
		int array[] = { -78, -89, -32, -90, -21 };
		System.out.println("The maximum value in an array is: " + findMaxVal(array));
	}

	// Returns maximum value from Array passed as parameter
	public static int findMaxVal(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];// if yes then update the max value to current element
			}
		}
		return max;
	}
}
