package P3;

//Index !! out of bounds for length !!
public class boundExce {
	public static void main(String[] args) {
		int[] myArray = new int[10];// Declaration and Instantiation of Array with length 10
		for (int i = 0; i < myArray.length; i++) {// Iterate through indexes 0-9
			myArray[i] = i + 1;// Initialize values to 1-10
		}

		for (int i : myArray) {
			System.out.println(i);
		}

		System.out.println("The value at myArray[11]] is:" + myArray[11]);
	}
}
