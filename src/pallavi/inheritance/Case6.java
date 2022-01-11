package pallavi.inheritance;

public class Case6 {
	public static void main(String[] args) {
		EmployeeMaster employeeMaster6 = new EmployeeDetails();
		EmployeeDetails employeeDetails6 = new EmployeeDetails();
		// employeeDetails6=employeeMaster6;// compilation error as we are trying to
		// assign parent(big type) to child(smaller type)

		employeeDetails6 = (EmployeeDetails) employeeMaster6;

		System.out.println(employeeDetails6.empName);
		System.out.println(employeeDetails6.empId); // id from Employee master
		System.out.println(employeeDetails6.empAge);
		System.out.println(employeeDetails6.empExp);

		employeeDetails6.setEmployeeInfo("Ridhdhi", 6666, 27);
		employeeDetails6.setEmployeeExp("Junior Eng", 5);
		employeeDetails6.getEmployeeInfo(); // This will print designation and exp as at runtime jvm will use defination
											// from EmployeeDetails class
		employeeDetails6.increaseAge();

	}

}
