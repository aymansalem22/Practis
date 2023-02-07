package defaultMethod;
// Challenge 2: Displaying Message Using Inheritance
 class Animal {
	
	public static void main(String[] args) {
		Zebra z1=new Zebra();
		z1.set_data(5, "Ana");
		System.out.println(z1.message_zebra(""));
		
		Dolphin d1=new Dolphin();
		d1.set_data(2, "Jin");
		System.out.println(d1.message_dolphin(""));
	}
	
	private String name;
	private int age;
	
	public Animal() {
		
	}
	public void set_data(int a,String b) {
		this.age=a;
		this.name=b;
	}
public String getName() {
	return name;
}

public int getAge() {
	return age;
}
	

}

class Zebra extends Animal{
	String message_zebra(String str) {
		str="The zebra named "+getName()+" is "+getAge()+" years old. The zebra comes from africa";
		return str;
	}
	
}
class Dolphin extends Animal{
	String message_dolphin(String str) {
		str="The dolphin named "+getName()+" is "+getAge()+" years old. The dolphin comes from New Zealand";
		return str;
	}
}






















