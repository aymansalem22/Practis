package P3;

public class sortArr {
	public static int[] sortAsc(int[] arr) {
		int temp = 0;// a variable to store temporary value while swapping
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr; // change this and return the correct result array
	}

	public static void main(String[] args) {
		int[] arr = { 77, 67, 22 };
		sortAsc(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
