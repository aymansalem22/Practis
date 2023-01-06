package P3;

public class arrayMeth {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, };
		System.out.println("The Values before calling the method are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");// printing the array before calling method
		}
		int[] returnedArr = multiply(arr, 3);
		System.out.println();
		System.out.println("The Values from the returend Array are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(returnedArr[i] + " ");// printing the returned array
		}
	}// end of main()

	static int[] multiply(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * num;
		}
		return arr;// returning Array
	}
}
