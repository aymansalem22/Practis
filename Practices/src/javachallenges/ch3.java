package javachallenges;

//50. Coding Exercises1:positive,negative or zero 
public class ch3 {
	
	public static void main(String[] args) {
		checkNumber(4);
		checkNumber(-5);
		checkNumber(0);
		checkNumberV2(44);
		checkNumberV2(-6);
		checkNumberV2(0);
	}
public static void checkNumber(int num) {
	if(num>0) {
		System.out.println("positive");
	}else if(num<0) {
		System.out.println("negative");
	}else {
		System.out.println("zero");
	}
}

public static void checkNumberV2(int num) {
	String check=num>0?"positive":(num<0)?"negative":"zero";
	System.out.println(check);
}
}





































