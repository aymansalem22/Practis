package javachallenges;

public class ch25 {

	public static boolean isPrime(int wholeNumber) {
		if (wholeNumber <= 2) {
			return (wholeNumber == 2);
		}
		for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
			if (wholeNumber % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int countPrime = 0;

		for (int i = 10; countPrime < 3 && i <= 50; i++) {
			if (isPrime(i)) {
				System.out.println("number: " + i + " is a prime number");
				countPrime++;
			}

		}
		// System.out.println("Total number of prime numbers between 10 and 50 is
		// "+countPrime);

	}

}
