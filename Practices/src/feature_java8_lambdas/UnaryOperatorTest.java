package feature_java8_lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
	public static void main(String[] args) {
		Person person = new Person();
		UnaryOperator<Person> operator = (p) -> {
			p.name = "John";
			p.age = 34;
			return p;
		};

		operator.apply(person);
		System.out.println("Person Name: " + person.getName() + " Person Age: " + person.getAge());
	}

}
