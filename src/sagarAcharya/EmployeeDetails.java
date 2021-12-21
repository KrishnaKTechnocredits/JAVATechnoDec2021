package sagarAcharya;

class EmployeeDetails{
	
	String firstname, lastname, deptname;
	int deptid;
	
	void setData(){
		firstname="Sagar";
		lastname="Acharya";
		deptid=12345;
		deptname="IT";
	}
	
	void displayInfo(){
		System.out.println("Employee first name is "+ firstname);
		System.out.println("Employee last name is "+ lastname);
	}
	
	void displayOtherInfo(){
		System.out.println("Employee dept name is "+ deptname);
		System.out.println("Employee dept id is " + deptid);
	}
	
	void updateDeptid(){
		deptid = 112233;
	}
	
	public static void main(String[] args){
		EmployeeDetails employee = new EmployeeDetails();
		employee.setData();
		employee.displayInfo();
		employee.displayOtherInfo();
		employee.updateDeptid();
		employee.displayOtherInfo();
	}
}