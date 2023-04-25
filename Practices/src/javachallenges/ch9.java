package javachallenges;

//Coding Exercise 7: Equal Sum Checker
public class ch9 {
	public static void main(String[] args) {
		System.out.println(hasEqualSum(1, 1, 1));
		System.out.println(hasEqualSum(1, 1, 2));
		System.out.println(hasEqualSum(1, -1, 0));
	}

	public static boolean hasEqualSum(int a, int b, int c) {
		return a + b == c;
		// another solutions
//		if((a+b)==c) {
//			return true;
//		}
//		
//		return false;
	}

}

