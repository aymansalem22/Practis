package javachallenges;

//Coding Exercise 13: Number In Word
public class ch21 {

	public static void printNumberInWord(int num) {
		String word;
		switch (num) {
		case 0:
			word = "ZERO";
			break;
		case 1:
			word = "ONE";
			break;
		case 2:
			word = "TWO";
			break;
		case 3:
			word = "THREE";
			break;
		case 4:
			word = "FOUR";
			break;
		case 5:
			word = "FIVE";
			break;
		case 6:
			word = "SIX";
			break;
		case 7:
			word = "SEVEN";
			break;
		case 8:
			word = "EIGHT";
			break;
		case 9:
			word = "NINE";
			break;
		default:
			word = "OTHER";
		}
		System.out.println(word);

	}

	public static void main(String[] args) {
		printNumberInWord(-4);
		printNumberInWord(7);

	}

}
