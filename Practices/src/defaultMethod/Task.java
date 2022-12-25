package defaultMethod;

//task about aggregation and composition
public class Task {
	public static void main(String[] args) {
		Driver driver = new Driver("John", 4453, "Volvo S60");
		driver.driverDetails();
	}
}

class Vehicles {

	private int id;
	private String model;

	public Vehicles(int id, String mod) {
		this.id = id;
		this.model = mod;
	}

	public void vehiclesDetails() {
		System.out.println("Vehicle_Detail: " + id + " " + model);
	}

}

class Driver {
	private String driverName;
	private Vehicles vehicle;

	public Driver(String name, int id, String mod) {
		this.driverName = name;
		this.vehicle = new Vehicles(id, mod);
	}

	public void driverDetails() {
		vehicle.vehiclesDetails();
		System.out.println("driver name is : " + driverName);
	}

}
