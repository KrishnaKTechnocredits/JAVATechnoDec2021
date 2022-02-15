package archana;

public class Ass34_Employee {
	private String empName;
	private int empId;

	public Ass34_Employee(int empID, String empName) {
		this.empName = empName;
		this.empId = empID;
	}

	public String toString() {
		return empId + "-->" + empName;
	}

	public int hashCode() {
		return empId;
	}

	public boolean equals(Object obj) {
		Ass34_Employee emp = (Ass34_Employee) obj;
		return (this.empId == emp.empId && this.empName.equals(emp.empName));

	}
}
