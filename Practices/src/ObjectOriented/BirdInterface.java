package ObjectOriented;

//Base class Bird
class BirdInterface {
 // Common trait of all birds so implemented in the base class
	
	public void eat() {
		System.out.println(getClass().getSimpleName()+" is eating!");
	}
	
	public static void main(String[] args) {
		Parrot parrot=new Parrot();
		Penguin penguin=new Penguin();
		
		parrot.eat();
		parrot.flying();
		
		System.out.println();
		
		penguin.eat();
		penguin.walk();
	}
}// End of Bird class


interface CanFly{
	//the method is by default abstract and public
	void flying();
}// End of CanFly interface

class Parrot extends BirdInterface implements CanFly{
	@Override
	public void flying() { // Overriding the method of CanFly interface
		System.out.println("Parrot is Flying!");
	}
	} // End of Parrot class

class Penguin extends BirdInterface{
	//Penguin cannot fly so not implementing CanFly
	public void walk() {
		System.out.println("Penguin is Walking!");
	}
} // End of Penguin class






















