package defaultMethod;

public class Pet {
	
	private static int newID=1;
	private int petID;
	private String petType;
	private String petName;
	private int petAge;
	
	public Pet(String type,String name,int age) {
		petType=type;
		petID=newID;
		petName=name;
		petAge=age;
		
		newID=newID+1;
	}
	
	public String getName() {
		return petType;
	}
	
	public static int getNewID() {
		return newID;
	}
	
	public void printPetDetails() {
		System.out.println("Pet ID: "+petID);
		System.out.println("Pet Type: "+petType);
		System.out.println("Pet Name: "+petName);
		System.out.println("Pet Age: "+petAge);
	}
	
	public static void main(String[] args) {
		Pet myDog=new Pet("dog", "Ruffy", 3);
		myDog.printPetDetails();
		
		Pet newCat=new Pet("cat", "Princess", 2);
		newCat.printPetDetails();
	}

}

































