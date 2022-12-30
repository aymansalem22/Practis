package P2;

//Learn Java from Scratch 
//Methods in practice  (pass by value)
public class Main {
	public static void main(String[] args) {
		String name = "John";
		changeName(name);
		System.out.println(name);
	}

	public static void changeName(String n) {
		n = "Doe";
		System.out.println(n);
	}
}
