// create an Employee class, havfing firstname, lastname, deptname and deptid as instance variable.
//create a method called setdata to set value in all instance variable
//Create a method call displayInfo -> which will print firstname and lastname
//Create a method called displayOtherInfo-> which should print deptName and deptId
// Create a method to update deptId-> which will update value of deptId
package shwetaBhosale;

class Employee{
	String firstname, lastname, deptname;
	int deptid;
	
	void setData(){
		firstname = "Shweta";
		lastname = "Bhos";
		deptname = "IT";
		deptid = 12231;
	}
	
	void displayInfo (){
		System.out.println("Employee firstname is " + firstname);
		System.out.println("Employee lastname is " + lastname);
	}
	
	void displayOtherInfo (){
		System.out.println("Employee deptname is " + deptname);
		System.out.println("Employee deptid is " + deptid);
	}
		
	void updateDeptid(){
		deptid = 112233;
		System.out.println("Dept id updated successfully");
	}
	
	public static void main(String[]  a){
		Employee employee = new Employee();
		employee.setData();
		employee.displayInfo();
		employee.displayOtherInfo();
		employee.updateDeptid();
		employee.displayOtherInfo();
	}
}