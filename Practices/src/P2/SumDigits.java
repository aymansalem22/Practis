package P2;
//Sum of Digits in an Integer
public class SumDigits {
	public static void main(String[] args) {
		int number = 12557;
		System.out.println("Number: " + number);
		System.out.println("Sum of digits in 1024 is: " + sumOfDig(number));
	}

	public static int sumOfDig(int var) {
		int result = 0;
		int lastDigit = 0;
		while (var > 0) {
			lastDigit = var % 10;
			result = result + lastDigit;
			System.out.println("Last Digit: " + lastDigit);
			System.out.println("Sum: " + result);
			var /= 10;
			System.out.println("Number: " + var);
		}
		return result;
	}

}
