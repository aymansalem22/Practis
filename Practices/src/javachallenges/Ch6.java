package javachallenges;

//Coding Exercise 4: Barking Dogs 
public class Ch6 {

	public static boolean shouldWakeUp(boolean BarkingDog, int hourOfDay) {
		return (BarkingDog && (hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23));

	}

	public static void main(String[] args) {
		System.out.println(shouldWakeUp(true, 1));
		System.out.println(shouldWakeUp(false, 2));
		System.out.println(shouldWakeUp(true, 8));
		System.out.println(shouldWakeUp(true, -1));
	}
}
