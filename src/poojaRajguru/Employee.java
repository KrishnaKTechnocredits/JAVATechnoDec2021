package poojaRajguru;

class Employee{
	int empid;
	String empname = "Pooja";
	int deptid;
	
	void printData(){
		System.out.println("Employee id is "+empid);
	System.out.println("Employee Name is "+empname + " and" + " Deptid is "+deptid);
	}
	
	public static void main(String[] args){
		Employee emp1 = new Employee();
		emp1.printData();
			
	}
	
}