package javachallenges;

// Coding Exercise 14: Number Of Days In Month
public class ch22 {

	public static void main(String[] args) {
		System.out.println(isLeapYearV2(-1600));
		System.out.println(isLeapYearV2(1600));
		System.out.println(isLeapYearV2(2017));
		System.out.println(isLeapYearV2(2000));

		System.out.println("-----------------------");

		System.out.println(getDaysInMonth(1, 2020));
		System.out.println(getDaysInMonth(2, 2020));
		System.out.println(getDaysInMonth(2, 2018));
		System.out.println(getDaysInMonth(-1, 2020));
		System.out.println(getDaysInMonth(1, -2020));

		System.out.println("-----------v2------------");

		System.out.println(getDaysInMonthV2(1, 2020));
		System.out.println(getDaysInMonthV2(2, 2020));
		System.out.println(getDaysInMonthV2(2, 2018));
		System.out.println(getDaysInMonthV2(-1, 2020));
		System.out.println(getDaysInMonthV2(1, -2020));
	}

	public static boolean isLeapYear(int year) {
		if (year >= 1 && year <= 9999) {
			if (year % 4 == 0 && year % 100 != 0) {
				return true;
			}
			if (year % 400 == 0) {
				return true;
			}
		}

		return false;

	}

	public static int getDaysInMonth(int month, int year) {
		if (month < 1 || month > 12) {
			return -1;
		}
		if (year < 1 || year > 9999) {
			return -1;
		}

		int days = switch (month) {
		case 2 -> isLeapYear(year) ? 29 : 28;
		case 4,6,9,11 -> 30;
		default -> 31;
		};

		return days;
	}

	public static boolean isLeapYearV2(int year) {
		return (year >= 1 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);

	}

	public static int getDaysInMonthV2(int month, int year) {
		if (month < 1 || month > 12 || year < 1 || year > 9999) {
			return -1;
		}

		switch (month) {
		case 2:
			return isLeapYearV2(year) ? 29 : 28;
		case 4:case 6:case 9:case 11:
			return 30;
		default:
			return 31;
		}
	}

}
