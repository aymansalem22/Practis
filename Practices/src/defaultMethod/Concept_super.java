package defaultMethod;

//The super keyword#
public class Concept_super {
	public static void main(String[] args) {
		UnderGrade one = new UnderGrade();
		System.out.println("Age without any method called, only constructor: " + one.age);
		one.set_age(50);
		System.out.println("Age after set_age(50) is called: " + one.age);
		one.set_age(10);
		System.out.println("Age after set_age(10) is called: " + one.age);
	}

}

class Student {
	public String name;
	public int age;

	public void setAge(int a) {
		age = a;
	}
}

class UnderGrade extends Student {
	public UnderGrade() {
		this.age = 10;
		this.name = "John Doe";
	}

	public void set_age(int a) {
		if (a < 50) {
			age = 0;
		} else {
			super.setAge(a);
		}
	}
}
