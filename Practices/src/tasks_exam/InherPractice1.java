package tasks_exam;

public class InherPractice1 {

	public static void main(String[] args) {
		Child1 c = new Child1();
		c.Print();
	}
}

class Grandparent {
	public Grandparent() {
		System.out.println("I am a Grandparent");
	}

	public void Print() {
		System.out.println("Inside Grandparent's Print Method");
	}
}

class Parent1 extends Grandparent {
	public void Print() {
		super.Print();
		System.out.println("Inside Parent's Print Method");
	}
}

class Child1 extends Parent1 {
	public void Print() {
		super.Print();
		System.out.println("Inside Child's Print Method");
	}
}
