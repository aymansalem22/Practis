package P5_Collections_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDesignNotImmutable {
	public static void main(String[] args) {
		Employee emp1 = new Employee(123, "Jane");
		Map<Employee, Integer> employeeMap = new HashMap<>();
		employeeMap.put(emp1, 56000);
		emp1.hashCode();
		emp1.empName = "Alex";
		System.out.println(emp1.hashCode());
		System.out.println(employeeMap.get(emp1));

	}
}
