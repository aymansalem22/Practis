package javachallenges;

//Coding Exercise 5: Leap Year Calculator
public class ch7 {

	public static void main(String[] args) {

		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(1924));

	}

	public static boolean isLeapYear(int year) {

//		if(year<1||year>9999) {
//			 return false;
//		}
//		
//		if(year%4==0) {
//			if(!(year%100==0)) {
//				return true;}
//				else if(year%400==0) {
//					return true;
//				}
//			}
//		
//			return false;

		if (year < 1 || year > 9999) {
			return false;
		} else if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else
			return year % 100 == 0 && year % 400 == 0;

	}
}
