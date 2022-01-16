package pallavi.inheritance;

public class Case3 {

	public static void main(String[] args) {
		EmployeeMaster employeeMaster3 = new EmployeeDetails();
		System.out.println(employeeMaster3.empName);
		System.out.println(employeeMaster3.empId);
		System.out.println(employeeMaster3.empAge);
		// System.err.println(employeeMaster3.empExp); compilation error as
		// EmployeeMaster is not seeing empExp

		employeeMaster3.setEmployeeInfo("Amit", 3333, 43);
		// employeeMaster3.setEmployeeExp("Manager",15); compilation error as
		// EmployeeMaster is not seeing setEmployeeExp
		employeeMaster3.getEmployeeInfo(); // This will print designation and exp as at runtime jvm will use defination
											// from EmployeeDetails class
		employeeMaster3.increaseAge();
	}
}
