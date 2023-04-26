package javachallenges;

//Coding Exercise 10: Minutes To Years and Days Calculator
public class ch16 {
	public static void main(String[] args) {
		printYearsAndDays(561600);
		printYearsAndDays(-525600);

	}

	public static void printYearsAndDays(long minutes) {
		long hour = minutes / 60;
		long day = hour / 24;
		long year = day / 365;
		day = day % 365;
		if (minutes < 0) {
			System.out.println("Invalid Value");

		} else {

			System.out.println(minutes + " min = " + year + " y and " + day + " d");
		}
	}
}