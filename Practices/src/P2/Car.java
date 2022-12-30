package P2;

class Car {
	public String colour;

	public Car() {
	}

	public Car(String col) {
		this.colour = col;
	}

	public String getColour() {
		return this.colour;
	}

	public static void main(String[] args) {
		Car newCar = new Car("Pink");
		System.out.println("Car colour is: " + newCar.getColour() + "\n");
		setColourBlue(newCar);
		System.out.println("Car colour is: " + newCar.getColour() + "\n");
	}

	public static void setColourBlue(Car c) {
		c.colour = "Blue";
	}

}
