package yogeshNagar.collectionprogramme;

public class A34_Employee {
	
	String empName;
	int empId;
	
	public A34_Employee(int empId,String empName) {
		this.empId=empId;
		this.empName = empName;
	}
	
	 public String toString() {
		return this.empId+" --> "+this.empName;
	}
	 	 
	public int hashCode() {
		return this.empId;
	}
	 
	 public boolean equals(Object obj) {
		 A34_Employee employee = (A34_Employee)obj;
		 return (this.empId==employee.empId && this.empName == employee.empName);
	 }
}