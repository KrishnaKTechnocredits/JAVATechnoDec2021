package yogeshNagar;

public class A18_Case6 {
	
//	This Condition become Case 2
	public static void main(String[] args) {
		A18_Organisation org = new A18_Employee();
		A18_Employee emp = new A18_Employee(); 
		
		emp =(A18_Employee)org; //Type casting is required
		
		System.out.println(emp.str); 
		System.out.println(emp.x);
		emp.employeeName();
		emp.employeeId();
		emp.organizationName(); 
	}
}