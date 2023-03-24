package feature_java8_streamapi;

import java.util.HashMap;
import java.util.Map;

public class StreamWithoutOptional {

	Map<Integer, Employee> empMap = new HashMap<>();

	public Employee getEmployee(Integer employeeId) {
		return empMap.get(employeeId);
	}

	public static void main(String[] args) {
		StreamWithoutOptional demo = new StreamWithoutOptional();

		// Fetching the employee with id 123. But since map is empty this will be null.
		Employee emp = demo.getEmployee(123);

		// This will throw Null Pointer Exception because emp is null
		System.out.println(emp.getName());
	}
}
