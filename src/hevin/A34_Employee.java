package hevin;

import java.util.HashSet;

public class A34_Employee {
	
	int id;
	String name;
	
	A34_Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return id+"-->"+name;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object o) {
		A34_Employee obj = (A34_Employee)o;
		return this.id == obj.id && this.name == obj.name;
	}
	
	
	public static void main(String[] args) {
		A34_Employee emp1 = new A34_Employee(1,"Hevin");
		A34_Employee emp2 = new A34_Employee(2,"Chintan");
		A34_Employee emp3 = new A34_Employee(1,"Hevin");
		A34_Employee emp4 = new A34_Employee(3,"Alpesh");
		
		HashSet<A34_Employee> emp = new HashSet<A34_Employee>();
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		
		System.out.println("Total Inputted Employees");
		System.out.println(emp1 +" "+ emp2 +" "+ emp3 +" "+ emp4);
		System.out.println();
		System.out.println("Unique Employees");
		
		for(A34_Employee e : emp) {
			System.out.println(" "+e.id+"---"+e.name);
		}
		
		System.out.println();
		System.out.println("**Unique Employee Count = "+emp.size());
	}
}
