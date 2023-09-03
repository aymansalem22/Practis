package javachallenges;

//61.for statement 
public class ch24 {

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
		System.out.println("0 is " + (isPrime(0) ? "" : "Not ") + "a prime number");
		System.out.println("1 is " + (isPrime(1) ? "" : "Not ") + "a prime number");
		System.out.println("2 is " + (isPrime(2) ? "" : "Not ") + "a prime number");
		System.out.println("3 is " + (isPrime(3) ? "" : "Not ") + "a prime number");
		System.out.println("8 is " + (isPrime(8) ? "" : "Not ") + "a prime number");
		System.out.println("17 is " + (isPrime(17) ? "" : "Not ") + "a prime number");

	}

}
