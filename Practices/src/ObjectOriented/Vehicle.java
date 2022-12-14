package ObjectOriented;

//Base Class
class Vehicle { 
	//private data Members
private String speed;
private String model;


public Vehicle() { // Default Constructor
	speed="100";
	model="Tesla";
}

//Getter Function
public String getSpeed() {
	return speed;
}

public String getModel() {
	return model;
}
}
//Derived Class
class Car extends Vehicle{
	public String name; // Name of a car
	
	public Car(){ // Default Constructor
		name="";
	}
	
	// This function sets the name of the car
	public void setDetails(String name) { // setter Function
		this.name=name;
	} 
	
	public String getDetails(String carName) {
		String details=carName+", "+getModel()+", "+getSpeed();
		return details;
	}
	
	public static void main(String[] args) {
		Car car=new Car();
		System.out.println(car.getDetails("Audi"));
	}
	
}


