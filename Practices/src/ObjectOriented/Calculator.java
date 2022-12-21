package ObjectOriented;

//Method Overloading Example
class Calculator {

	// Add functions with two parameters
	int add(int num1, int num2) {
		return num1 + num2;
	}

	// Add functions with three parameters
	int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	// Add functions with four parameters
	int add(int num1, int num2, int num3, int num4) {
		return num1 + num2 + num3 + num4;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("10 + 20 = " + calc.add(10, 20));
		System.out.println("10 + 20+ 30 = " + calc.add(10, 20, 30));
		System.out.println("10 + 20 + 30 + 40 = " + calc.add(10, 20, 30, 40));

	}

}
