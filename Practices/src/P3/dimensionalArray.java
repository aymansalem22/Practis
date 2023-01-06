package P3;

//two-dimensional character 
public class dimensionalArray {
	public static void main(String[] args) {
		char[][] twoDimArray = new char[3][3]; // instantiating a character array of size 3*3=9 elements

		twoDimArray[0][0] = 'a'; // stores a at row:0, column:0 position
		twoDimArray[0][1] = 'b';
		twoDimArray[0][2] = 'c';
		twoDimArray[1][0] = 'd';
		twoDimArray[1][1] = 'e';
		twoDimArray[1][2] = 'f';
		twoDimArray[2][0] = 'g';
		twoDimArray[2][1] = 'h';
		twoDimArray[2][2] = 'i';

		// printing out the stored values

		System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][1] + " " + twoDimArray[0][2] + "\n");
		System.out.println(twoDimArray[1][0] + " " + twoDimArray[1][1] + " " + twoDimArray[1][2] + "\n");
		System.out.println(twoDimArray[2][0] + " " + twoDimArray[2][1] + " " + twoDimArray[2][2]);
	}

}
