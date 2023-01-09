package javachallenges;

//48. Method Challenge
public class Ch2 {

	public static void main(String[] args) {
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Ayman", highScorePosition);

		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("David", highScorePosition);

		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Tim", highScorePosition);

		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Bob", highScorePosition);

		highScorePosition = calculateHighScorePosition(25);
		displayHighScorePosition("Ali", highScorePosition);
	}

	public static void displayHighScorePosition(String namePlayer, int highScorePosition) {
		System.out
				.println(namePlayer + " managed to get into position " + highScorePosition + " on the high score list");
	}

	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500) {
			return 2;
		}

		else if (playerScore >= 100) {
			return 3;
		} else {
			return 4;
		}
	}
}
