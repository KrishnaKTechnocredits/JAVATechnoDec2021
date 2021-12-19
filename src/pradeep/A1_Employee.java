package pradeep;

class A1_Employee
{
	int empid;
	String empname;
	int deptid;
	
	void printData(){
		System.out.println("Employee id is" + empid);
		System.out.println("Employee name is "+ empname+"and dept id is "+ deptid);
	}
	public static void main(String[] args){
		A1_Employee employee = new A1_Employee();
		employee.printData();
	}
	
}