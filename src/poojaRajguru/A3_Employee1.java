package poojaRajguru;

class A3_Employee1{
	String firstname,lastname,deptname;
	int deptid;
	
	void setData(){
		firstname = "Pooja";
		lastname = "Rajguru";
		deptname = "IT";
		deptid = 1234;
	}
	
	void displayInfo(){
		System.out.println("Employee First name is " + firstname);
		System.out.println("Employee Last name is " + lastname);
	}

	void displayOtherInfo(){
		System.out.println("Employee Dept name is " + deptname);
		System.out.println("Employee Dept Id is " + deptid);
	}

	void updateDeptId(){
		System.out.println("Department ID updated succussfully !!");
		deptid = 5678;
	}
	
	public static void main(String[] args){
		A3_Employee1 employee = new A3_Employee1();
		employee.setData();
		employee.displayInfo();
		employee.displayOtherInfo();
		employee.updateDeptId();
		employee.displayOtherInfo();
	}

}