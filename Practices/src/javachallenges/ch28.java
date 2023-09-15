package javachallenges;

//Coding Exercise 16: Number Palindrome
public class ch28 {

	public static boolean isPalindrome(int number) {
		number = Math.abs(number);
		int number2 = number;
		int reverse = 0;

		while (number2 > 0) {
			reverse = (number2 % 10) + (reverse * 10);
			number2 /= 10;
		}
		return number == reverse;
	}

	public static void main(String[] args) {
		if (isPalindrome(-1221)) {
			System.out.println("it is Palindrome");
		} else {
			System.out.println("it is not Palindrome");
		}

		System.out.println("---------------------------------");

		if (isPalindrome(11212)) {
			System.out.println("it is Palindrome");
		} else {
			System.out.println("it is not Palindrome");
		}

	}

}
