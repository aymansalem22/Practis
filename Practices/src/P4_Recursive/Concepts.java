package P4_Recursive;

// Changing Iterative Code to Recursive
public class Concepts {
	public static void main(String[] args) {
		int input = 1435043;
		int numDigits = iterative.countDigits(input);
		System.out.println("Number of digits in " + input + " = " + numDigits);
		System.out.println(".....................");
		int input2 = 14333220;
		int numDigits2 = recursive.countDigits(input2);
		System.out.println("Number of digits in " + input2 + " = " + numDigits2);
	}

	class iterative {
		public static int countDigits(int num) {
			int count = 0;
			while (num > 0) {
				num = num / 10;
				count++;
			}
			return count;
		}
	}

	class recursive {
		public static int countDigits(int num) {
			if (num <= 1) {
				return 1;
			} else {
				return 1 + countDigits(num / 10);
			}
		}
	}
}
