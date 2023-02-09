package tasks_exam;

public class Task2 {
	public static void main(String[] args) {
		char[] pass = { '4', '3', '2', '1', '5', '6', '7', '8', 'z', 'a' };
		System.out.println(check(pass));

	}

	public static boolean check(char[] password) {
		String str = String.valueOf(password);
		int n = 0;
		for (int i = 0; i < str.length(); i++) {
			char l = str.charAt(i);
			if (Character.isDigit(l)) {
				n++;
			}
			;
		}
		System.out.println("--- digit is ----");
		System.out.println(n);

		String PASSWORD_PATTERN = "(?=.*[a-z]){8}";

		if ((password.length >= 8) && (str.matches(PASSWORD_PATTERN)) && (n > 2)) {

			return true;
		}

		return false;
	}
}
