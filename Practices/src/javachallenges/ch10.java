package javachallenges;

//Coding Exercise 8: Teen Number Checker
public class ch10 {

	public static void main(String[] args) {
		System.out.println(isTeen(13));
		System.out.println(hasTeen(22, 23, 34));
		System.out.println(hasTeen(23, 15, 43));

	}

	public static boolean hasTeen(int a, int b, int c) {
		return isTeen(a) || isTeen(b) || isTeen(c);

	}

	public static boolean isTeen(int a) {
		return a >= 13 && a <= 19;
	}

}

/*
 * 
 * 
 * public static boolean hasTeen(int a,int b,int c) { if(a>=13&&a<=19) { return
 * true; } else if(b>=13&&b<=19) { return true; } else if(c>=13&&c<=19) { return
 * true; }
 * 
 * return false;
 * 
 * }
 * 
 * public static boolean isTeen(int a) { if(a>=13&&a<=19) { return true; }
 * 
 * 
 * return false;
 * 
 * }
 * 
 * 
 */
