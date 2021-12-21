package nehaPandey;

class Employee {
	String firstname, lastname, deptname;
	int deptid;

	void setData() {
		firstname = "Maulik";
		lastname = "Kanani";
		deptname = "IT";
		deptid = 12123;
	}

	void displayInfo() {
		System.out.println("Employee firstname is " + firstname);
		System.out.println("Employee lastname is " + lastname);
	}

	void displayOtherInfo() {
		System.out.println("Employee deptname is " + deptname);
		System.out.println("Employee deptid is " + deptid);
	}

	void updateDeptid() {
		deptid = 112233;
		System.out.println("deptid is updated successfully");
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setData();
		employee.displayInfo();
		employee.displayOtherInfo();
		employee.updateDeptid();
		employee.displayOtherInfo();

	}
}