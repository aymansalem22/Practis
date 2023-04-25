package javachallenges;

public class ch8 {

	// Coding Exercise 6: DecimalComparator
	public static void main(String[] args) {

		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

	}

	public static boolean areEqualByThreeDecimalPlaces(Double myFirstDouble, Double mySecondDouble) {
		int myFirstCheck = (int) (myFirstDouble * 1000);
		int mySecondCheck = (int) (mySecondDouble * 1000);
		if (myFirstCheck - mySecondCheck == 0) {

			return true;
		} else

			return false;

	}
	// another solution -->
	// public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
	// {
	// return (int) (num1 * 1000) == (int) (num2 * 1000);}

}


