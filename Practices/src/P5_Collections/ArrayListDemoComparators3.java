package P5_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//lambda expressions 
public class ArrayListDemoComparators3 {
	public static void main(String[] args) {
		List<Vehicle5> list = new ArrayList<>();
		list.add(new Vehicle5("Volkswagen", 2010));
		list.add(new Vehicle5("Audi", 2009));
		list.add(new Vehicle5("Ford", 2001));
		list.add(new Vehicle5("BMW", 2015));

		System.out.println("Sorting by brand name");
		Collections.sort(list, (o1, o2) -> o1.brand.compareTo(o2.brand));
		for (Vehicle5 vehicle5 : list) {
			System.out.println("Vehicle Brand: " + vehicle5.brand + " , Vehicle Make: " + vehicle5.makeYear);
		}
		System.out.println("Sorting by make year");
		Collections.sort(list, (o1, o2) -> o1.makeYear.compareTo(o2.makeYear));

		for (Vehicle5 vehicle5 : list) {
			System.out.println("Vehicle Brand: " + vehicle5.brand + " , Vehicle Make: " + vehicle5.makeYear);

		}
	}

}

class Vehicle5 {
	String brand;
	Integer makeYear;

	public Vehicle5(String brand, Integer makeYear) {
		this.brand = brand;
		this.makeYear = makeYear;
	}
}
