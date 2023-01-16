package javachallenges;

//Coding Exercise 2: Speed Converter
public class ch4 {
	public static long toMilesPerHour(double kilometersPerHour) {

		if (kilometersPerHour < 0) {

			return -1;
		} else {
			long output = Math.round(kilometersPerHour / 1.609);

			return output;
		}
	}

	public static void printConversion(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			System.out.print(kilometersPerHour + " km/h = ");
			System.out.println(toMilesPerHour(kilometersPerHour) + " mi/h");
		}

	}

	public static void main(String[] args) {

		printConversion(1.5);
		printConversion(10.25);
		printConversion(-5.6);
		printConversion(25.42);
		printConversion(75.144);
		printConversion(-2.0);
		printConversion(-10.0);

	}

}
