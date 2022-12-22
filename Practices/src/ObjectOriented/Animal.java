package ObjectOriented;

abstract class Animal {
	public abstract void makeSound();

	public void move() {
		System.out.println(getClass().getSimpleName() + " is moving");
	}

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal sheep = new Sheep();

		dog.makeSound();
		dog.move();

		cat.makeSound();
		cat.move();

		sheep.makeSound();
		sheep.move();
	}

}

class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Woof Woof...");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Meow Meow...");
	}
}

class Sheep extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Baa Baa..");
	}
}
