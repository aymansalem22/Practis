package feature_java8_streamapi;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StreamOptional {

	Map<Integer, Employee> empMap = new HashMap<>();

	public Optional<Employee> getEmployee(Integer employeeId) {
		return Optional.ofNullable(empMap.get(employeeId));
	}

	public static void main(String[] args) {
		StreamOptional demo = new StreamOptional();
		Optional<Employee> emp = demo.getEmployee(123);
		if (emp.isPresent()) {
			System.out.println(emp.get().getName());
		} else {
			System.out.println("No employee returned.");
		}

	}

}
