/*Assignment - 34 : 8th Feb'2022

Write a method to return list of unique Employees.
Employee class should have 2 attribute : empid, empname
unique = same empid, empname.

Hint : Override hashcode and equals method.
Please refer Session-50 recording in case of any doubts.*/
package anjali.Assignment34;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	static int  count;
	int empid;
	String empname;
	
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

   @Override
   public String toString() {
	return empid+"=>"+empname;
   }
   
   public int hashCode() 
   {
	  System.out.println("hashcode method call");
	  return empid;
   }
   
   public boolean equals(Object obj) {
	   
	   System.out.println("equals method call");
	   Employee employee=(Employee)obj;
	   return(this.empname==employee.empname);
   }
   

	public static void main(String[] args) {
		Employee employee= new Employee(1,"Anjali");
		Employee employee1= new Employee(2,"shivangi");
		Employee employee2= new Employee(3,"apurva");
		Employee employee3= new Employee(1,"maya");
		
		Set<Employee> set= new HashSet();
		set.add(employee);
		set.add(employee1);
		set.add(employee2);
		set.add(employee3);
	
		System.out.println(set);
		
		
		
	}

}

