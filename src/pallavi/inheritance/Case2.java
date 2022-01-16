package pallavi.inheritance;

public class Case2 {
	public static void main(String[] args) {
		EmployeeDetails empDetails2 = new EmployeeDetails();
		System.out.println(empDetails2.empName);
		System.out.println(empDetails2.empAge);
		System.out.println(empDetails2.empId); /// 2222 will print as the variable is already present in child class
		System.out.println(empDetails2.empDesignation);
		System.out.println(empDetails2.empExp);

		empDetails2.setEmployeeInfo("Shree", 1145, 32);
		empDetails2.setEmployeeExp("Sr.engineer", 7);
		empDetails2.getEmployeeInfo(); // this will print designation and exp as defined in child class
		empDetails2.increaseAge();
	}
}
