package ashok;
class Employee{
	
	int empid;//by default value set to 0
	String empname;//by default value set to Null 
	int deptid;//by default value set to 0
	
	void printdata(){
		System.out.println("Employee Id is "+ empid);
		System.out.println("Employee Name is "+ empname);
		System.out.println("Employee Department id is "+ deptid);
	}
	
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.printdata();
	}
}
