package tasks_exam;

public class Task2 {
	public static void main(String[] args) {
		char[] pass = { 'a', 'c', 'd', '1', 't', 'y', 'r', '4', 'x', 'p' };
		System.out.println(check(pass));

	}

	public static boolean check(char[] password) {
		String str = String.valueOf(password);
		String PASSWORD_PATTERN = "(?=.*[a-z])(?=(.*\\d){2}).{8,}$";
		if ((str.matches(PASSWORD_PATTERN))) {

			return true;
		}

		return false;
	}
}
