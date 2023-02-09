package tasks_exam;

//Rotate The Array
public class Task3 {
	public static void main(String[] args) {
		int[] t = { 5,65,0};
		rotate(t);
	}

	public static int[] rotate(int[] arr) {
		int[] arrTest = new int[arr.length];

		int index = 0;
		int s = arr.length;

		for (int i = 0; i < arr.length; i++) {
			arrTest[index] = arr[s - 1];
			index++;

			s--;
		}

		for (int i : arrTest) {
			System.out.print(i + " ");
		}

		return arr;
	}
}

/*
 * Rotate The Array
 * 
 * In this coding question, you are asked to implement the function rotate(int[]
 * arr) that takes an integer array as input and returns an integer array as
 * well.
 * 
 * Your task is to rotate the array twice in a clockwise direction, i.e., all
 * the elements will move two blocks to the right in the array. The element at
 * the last index will move to the first index of the array and so on.
 * 
 * Below are some examples of how the output arrays should look like: Input
 * Output [1,2,3,4] [3,4,1,2] [55,6,-1,7,100] [7,100,55,6,-1] [1,2] [2,1]
 * [5,65,0] [65,0,5]
 * 
 * Note: It is up to you whether you want to make changes in the same array or
 * want to create a different one.
 * 
 */
