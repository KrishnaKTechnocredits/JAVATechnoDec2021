package ranjeet;
class Example1{
	// instance variable has default value
	int empId; // 0
	String empName; // Null
	int deptId; // 0
	
	void printData(){
		System.out.println("Employee id is "+ empId + " Employee Name is " + empName + " Employee dept is " + deptId);
	}
	public static void main(String args[]){
		Example1 employee = new Example1();
		employee.printData();
	}
}