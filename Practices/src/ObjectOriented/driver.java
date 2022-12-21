package ObjectOriented;

//Method Overriding Example
//A sample class Shape which provides a method to get the Shape's area
class Shape {

	public double getArea() {
		return 0;
	}
}

//A Rectangle is a Shape with a specific width and height
class Rectangle extends Shape {// extended form the Shape class
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// Method Overriding Example
	public double getArea() {
		return width * height;
	}
}

//A Circle is a Shape with a specific radius

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}

class driver {
	// polymorphism
	public static void main(String[] args) {
		Shape[] shape = new Shape[2];// Creating shape array of size 2
		shape[0] = new Rectangle(2, 2);// creating rectangle object at index 0
		shape[1] = new Circle(2);// creating circle object at index 1
		System.out.println("Area of the Rectangle: " + shape[0].getArea());
		System.out.println("Area of the Circle: " + shape[1].getArea());

	}

}
