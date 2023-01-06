package P2;

import java.util.Random;

public class Coin {

	public static void main(String[] args) {
		// create a new random number generator object
		Random rand = new Random();

		// pick a random number between 0 and 1:
		int n = rand.nextInt(2);
		System.out.println("Picked random value " + n);

		if (n == 0) {
			System.out.println("Tails");
		}
		if (n == 1) {
			System.out.println("Heads");
		}

	}
}
