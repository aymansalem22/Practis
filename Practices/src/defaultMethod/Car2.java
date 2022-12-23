package defaultMethod;

class Car2 {// Base class
	private int model;
	private String manufacturer;

	public Car2(int model, String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
	}

	public void printDetails() {
		System.out.println("The model of " + getClass().getSimpleName() + " is: " + model);
		System.out.println("The manufacturer of " + getClass().getSimpleName() + " is: " + manufacturer);
	}

	public static void main(String[] args) {
		Elantra sport = new Elantra(2019, "Sport");
		Elantra eco = new Elantra(2018, "Eco");

		sport.printDetails();
		sport.bootSpace();

		System.out.println();

		eco.printDetails();
		eco.bootSpace();
	}

}// end of class

interface IsSedan { // Interface for sefans
	int bootSpace = 420; // Sedans have boot space

	void bootSpace();// Every sedan must implement this

} // End of IsSedan interface

class Elantra extends Car2 implements IsSedan {
	private String variant;// Elantra's data member

	public Elantra(int model, String variant) {
		super(model, "Hyndai"); // Calling the parent constructor with already known manudacturer
		this.variant = variant;
	}

	@Override
	public void bootSpace() {// implementation of the interface method
		System.out.println("The bootspace of elantra is: " + IsSedan.bootSpace + " litres");
	}

	@Override
	public void printDetails() {// overriding the parent class's inherited method
		super.printDetails();// calling the method from parent class
		System.out.println("The variant of Elantra is: " + variant);// printing the data memeber of this class

	}
}// end of elantra class
