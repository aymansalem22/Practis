package P5_Collections_Arrays;

import java.util.Objects;

public class Employee {
	int empId;
	String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.empId == emp.empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}
