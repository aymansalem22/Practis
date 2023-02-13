package P4_Recursive;

// Sort an Array
public class ExampleClass9 {
	public static void sortArray(int[] array, int n) {
		if (n == 1) {
			return;
		}

		for (int i = 0; i < n - 1; i++) {

			if (array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;

			}
		}
		sortArray(array, n - 1);
	}

	public static void main(String[] args) {
		System.out.println("Unsorted Array: ");
		int[] arr = { 40, 24, 60, 15, 10, 45, 93 };
		System.out.print("{ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("} ");
		System.out.println("Sorted Array: ");
		sortArray(arr, arr.length);
		System.out.print("{ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("} ");
	}

}
