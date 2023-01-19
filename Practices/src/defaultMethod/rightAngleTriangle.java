package defaultMethod;

//Challenge 1: Calculating the Area
public class rightAngleTriangle {
	// Define the member variables, constructor and relevant area method
	private double length;
	private double height;

	public rightAngleTriangle(double l, double h) {
		this.height = h;
		this.length = l;
	}

	public double area() {

		return (length * height / 2.0);

	}

	public static double test(rightAngleTriangle rt) {
		return rt.area();
	}

	public static void main(String[] args) {
		rightAngleTriangle t1 = new rightAngleTriangle(3, 5);
		System.out.println("Area of right Angle traingle: " + test(t1));

		rightAngleTriangle t2 = new rightAngleTriangle(10, 20);
		System.out.println("Area of right Angle traingle: " + test(t2));
	}

}
