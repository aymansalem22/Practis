package P5_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemoComparable4 {
	public static void main(String[] args) {
		List<Vehicle2> list = new ArrayList<>();
		list.add(new Vehicle2("Volksswagen", 2010));
		list.add(new Vehicle2("Audi", 2009));
		list.add(new Vehicle2("Ford", 2001));
		list.add(new Vehicle2("BMW", 2015));

		Collections.sort(list);
		for (Vehicle2 vehicle2 : list) {
			System.out.println("Vehicle Brand: " + vehicle2.brand + " ,Vehicle Make: " + vehicle2.makeYear);
		}
	}

}

class Vehicle2 implements Comparable<Vehicle2> {
	String brand;
	Integer makeYear;

	public Vehicle2(String brand, Integer makeYear) {
		super();
		this.brand = brand;
		this.makeYear = makeYear;
	}

	@Override
	public int compareTo(Vehicle2 o) {
		return this.brand.compareTo(o.brand);
	}
}