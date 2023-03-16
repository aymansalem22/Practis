package feature_java8_lambdas;

public class Person {
	public String name;
	public int age;
	public String country;
	public int yearOfService;

	public Person() {
		super();
	}

	public Person(String name) {

		this.name = name;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

	public int getYearOfService() {
		return yearOfService;
	}

	public void setYearOfService(int yearOfService) {
		this.yearOfService = yearOfService;
	}

}
