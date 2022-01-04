package yogeshNagar;

public class A18_Case5 {
	
//	This Condition become Case 3
	public static void main(String[] args) {
		A18_Organisation org = new A18_Organisation();
		A18_Employee emp = new A18_Employee(); 
		
		org = emp;
		
//		System.out.println(org.str); //Belongs to employee class child class
		System.out.println(org.x);
		org.employeeName();
		org.employeeId();
//		org.organizationName(); //Belongs to employee class child class
	}
}