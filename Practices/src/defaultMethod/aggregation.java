package defaultMethod;

public class aggregation {

	public static void main(String[] args) {
		Country country = new Country("Ghana", 1);
		{
			Person user = new Person("Ali Vader", country);
			user.printDetails();

		}
		System.out.println(country.getName());

	}
}

class Country {
	private String name;
	private int population;

	public Country(String n, int p) {
		name = n;
		population = p;
	}

	public String getName() {
		return name;
	}

}

class Person {
	private String name;
	private Country country; // An instance of Country class

	public Person(String n, Country c) {
		name = n;
		country = c;
	}

	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Country: " + country.getName());
	}

}
