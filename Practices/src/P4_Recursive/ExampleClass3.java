package P4_Recursive;

//reversing string
public class ExampleClass3 {

	public static String reverseString(String myStr) {
		// base case
		if (myStr.isEmpty()) {
			return myStr;
		}
		// recursive case
		else {
			return reverseString(myStr.substring(1)) + myStr.charAt(0);
		}
	}

	public static void main(String[] args) {
		String string1 = "Hello World";
		System.out.println("The original String is: ");
		System.out.println(string1);

		String resultStr = reverseString(string1);
		System.out.println("String after reversal: ");
		System.out.println(resultStr);
	}
}
