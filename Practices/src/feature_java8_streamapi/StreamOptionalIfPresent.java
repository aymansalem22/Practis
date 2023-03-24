package feature_java8_streamapi;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StreamOptionalIfPresent {

	Map<Integer, Employee> empMap = new HashMap<>();

	public void populateEmployee() {
		empMap.put(123, new Employee("Ayman", 23, 13000));
	}

	public Optional<Employee> getEmployee(Integer employeeId) {
		return Optional.ofNullable(empMap.get(employeeId));
	}

	public static String getDefaultValue() {
		return "default";
	}

	public static void main(String[] args) {

		StreamOptionalIfPresent demo = new StreamOptionalIfPresent();
		demo.populateEmployee();
		Optional<Employee> emp = demo.getEmployee(123);
		emp.ifPresent(System.out::println);

		Optional<Employee> optional2 = Optional.ofNullable(new Employee("Ali", 21, 17000));
		System.out.println(optional2.get());

		// java.util.NoSuchElementException: No value present

//	Optional<Employee> optional3=Optional.ofNullable(null);
//	System.out.println(optional3.get());
//	

		Optional<Employee> optional4 = Optional.ofNullable(null);
		System.out.println(optional4.orElse(null));

		Optional<String> optiona5 = Optional.ofNullable(null);
		// This will return the default value.
		System.out.println(optiona5.orElse("default string"));

		Optional<String> optional6 = Optional.ofNullable(null);
		System.out.println(optional6.orElseGet(StreamOptionalIfPresent::getDefaultValue));

		// java.lang.Exception: Reource not found.
//	Optional<String> optional7=Optional.ofNullable(null);
//	try {
//		System.out.println(optional7.orElseThrow(() -> new Exception("Reource not found.")));
//	}
//	catch(Exception e) {
//		e.printStackTrace();
//	}

		Optional<String> optional8 = Optional.ofNullable("orange");
		System.out.println(optional8.filter(str -> str.equals("orange")));

		System.out.println(optional8.filter(str -> str.equals("apple")));

	}
}
