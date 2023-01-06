package P3;

//concept arrays 
public class arrays1 {
	public static void main(String[] args) {
		int[] myArray = new int[10];// Declaration and instantiation of array with legth 10
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i + 1;// Initialize values to 1-10
		}
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("The value at myArray[" + i + "] is: " + myArray[i]);
			// printing all values to console
		}
	}
}
