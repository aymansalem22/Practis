package javachallenges;

//Coding Exercise 17: First And Last Digit Sum
public class ch29 {

	public static int sumFirstAndLastDigit(int num) {
		if (num < 0) {
			return -1;
		}

		int lastDigit = num % 10;
		while (num > 9) {
			num /= 10;
		}
		return lastDigit + num;
	}

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(69345));
	}

}
