package javachallenges;

//Coding Exercise 18: Even Digit Sum

public class ch30 {

	public static int getEvenDigitSum(int num) {

		if (num < 0)
			return -1;

		int sum = 0;
		int reminder = 0;
		while (num > 0) {
			reminder = num % 10;
			if (reminder % 2 == 0) {
				sum += reminder;
			}
			num = num / 10;
		}

		return sum;

	}

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));
		System.out.println(getEvenDigitSum(0));
	}

}
