package P3;

public class charArr {
	public static void main(String[] args) {
		char[] chArray1 = { 'a', 'b', 'c' };// initialization of first char array

		char[] chArray2 = new char[5];// instantiation of second char array
		int index = 0;
		for (char i = 'v'; i <= 'z'; i++) {
			chArray2[index] = i;
			index++;
		}
		// printing out the stored values in the arrays
		System.out.println("The Values stored in chArray1 are: ");

		for (int i = 0; i < chArray1.length; i++) {
			System.out.println(chArray1[i] + " ");
		}
		System.out.println();
		System.out.println("The Values stored in chAarray2 are: ");

		for (int i = 0; i < chArray2.length; i++) {
			System.out.println(chArray2[i] + " ");
		}
	}

}
