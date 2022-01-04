package pallavi.inheritance;

public class Case1 {
	public static void main(String[] args) {
		EmployeeMaster empMaster1 = new EmployeeMaster();
		System.out.println(empMaster1.empName);
		System.out.println(empMaster1.empId);
		System.out.println(empMaster1.empAge);
		// empMaster1.empExp=10; compilation error as empExp is not property/variable of
		// class EmployeeMaster

		empMaster1.setEmployeeInfo("Avi", 150, 35);
		empMaster1.getEmployeeInfo();
		// empMaster1.getEmployeeExp(); compilation error as getEmployeeExp is not
		// belongs to class EmployeeMaster
	}
}
