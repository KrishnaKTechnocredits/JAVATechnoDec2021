package pallavi.inheritance;

public class EmployeeMaster {

	String empName = "Pallavi";
	int empId = 1111;
	int empAge = 40;

	void setEmployeeInfo(String name, int id, int age) {
		empId = id;
		empAge = age;
		empName = name;
	}

	void getEmployeeInfo() {
		System.out.println("Employee Name:-" + empName);
		System.out.println("Employee id:-" + empId);
		System.out.println("Employee Age:-" + empAge);
	}

	int increaseAge() {
		empAge++;
		System.out.println(empAge);
		return empAge;
	}
}
