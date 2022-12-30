package P2;
//Method to Check Sum
class Example2 {

	public static void main(String[] args) {
		int answer = checkSum(100, 110);
		System.out.println("The value of check is: " + answer);

		answer = checkSum(100, 0);
		System.out.println("The value of check is: " + answer);

		answer = checkSum(100, -110);
		System.out.println("The value of check is: " + answer);

	}

	public static int checkSum(int a, int b) {
		int check;
		int sum = a + b;
		if (sum < 100) {
			check = 0;
		} else if (sum > 100)
			check = 1;
		else
			check = 2;

		return check;

	}

}
