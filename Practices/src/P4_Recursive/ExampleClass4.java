package P4_Recursive;

//RemoveDuplicatesClass
public class ExampleClass4 {
	public static String remDuplicates(String text) {
		if (text.length() == 1) {
			return text;
		}
		if (text.substring(0, 1).equals(text.substring(1, 2))) {
			return remDuplicates(text.substring(1));
		} else {
			return text.substring(0, 1) + remDuplicates(text.substring(1));
		}
	}

	public static void main(String[] args) {
		String input1 = "Hello";
		String input2 = "Thiss iiss aa teesstt";

		System.out.println("Original string: " + input1);

		String output1 = remDuplicates(input1);
		System.out.println("String after: " + output1);

		System.out.println("Original string: " + input2);

		String output2 = remDuplicates(input2);
		System.out.println("String after: " + output2);
	}
}
