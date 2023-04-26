package javachallenges;

//Coding Exercise 12: Playing Cat
public class ch18 {

	public static void main(String[] args) {
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
		System.out.println(isCatPlaying(true, 45));
		System.out.println(isCatPlaying(true, 46));
	}

	public static boolean isCatPlaying(boolean summer, int temperature) {
		if (temperature >= 25 && temperature <= 35) {
			return true;
		} else if (summer && (temperature >= 35 && temperature <= 45)) {
			return true;
		}

		return false;
	}

}
