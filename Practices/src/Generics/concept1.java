package Generics;

public class concept1<T> {
	public static void main(String[] args) {
		concept1<Integer> obj1 = new concept1<Integer>(5);
		System.out.println(obj1.getObject());

		concept1<Double> obj2 = new concept1<Double>(15.777755);
		System.out.println(obj2.getObject());

		concept1<String> obj3 = new concept1<String>("Yayy! That's my first Generic Class.");
		System.out.println(obj3.getObject());

	}

	T obj; // An object of type T is declared

	concept1(T obj) { // parameterized constructor
		this.obj = obj;
	}

	public T getObject() { // get method
		return this.obj;
	}

}
