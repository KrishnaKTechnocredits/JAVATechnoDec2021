package pallavi.inheritance;

public class Case5 {
	public static void main(String[] args) {
		EmployeeMaster employeeMaster5 = new EmployeeMaster();
		EmployeeDetails employeeDetails5 = new EmployeeDetails();
		employeeMaster5 = employeeDetails5;

		System.out.println(employeeMaster5.empName);
		System.out.println(employeeMaster5.empId); // id from Employee master
		System.out.println(employeeMaster5.empAge);
		// System.out.println(employeeMaster5.empExp); compilation error as
		// EmployeeMaster is not seeing empExp

		employeeMaster5.setEmployeeInfo("Arjun", 5555, 43);
		// employeeMaster5.setEmployeeExp("Junior Eng",5); compilation error as
		// EmployeeMaster is not seeing setEmployeeExp
		employeeMaster5.getEmployeeInfo(); // This will print designation and exp as at runtime jvm will use defination
											// from EmployeeDetails class
		employeeMaster5.increaseAge();

	}

}
