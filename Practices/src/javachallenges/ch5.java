package javachallenges;

//Coding Exercise 3: MegaBytes Converter
public class ch5 {

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		int megabyte = Math.round(kiloBytes) / 1024;
		// int reminingkb = (kiloBytes - (1024 * Math.round(megabyte)));
		int reminingkb = kiloBytes % 1024;
		if (kiloBytes < 0)
			System.out.println("Invalid Value");

		else

			System.out.println(kiloBytes + " KB = " + megabyte + " MB and " + reminingkb + " KB");
	}

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(5000);
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-2500);
	}
}
