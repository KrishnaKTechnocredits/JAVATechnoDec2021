package swati.Swati_Assignment34;

import java.util.ArrayList;
import java.util.HashSet;

public class listEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Employee> al=new HashSet<Employee>();
		al.add(new Employee(1,"Swati"));
		al.add(new Employee(2, "Sagar"));
		al.add(new Employee(1,"Swati"));
		System.out.println(al.size());
	}

}
