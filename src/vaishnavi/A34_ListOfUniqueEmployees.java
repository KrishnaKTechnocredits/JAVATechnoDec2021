package vaishnavi;

import java.util.HashSet;
import java.util.ArrayList;

public class A34_ListOfUniqueEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<A34_UniqueEmployees> al = new HashSet<A34_UniqueEmployees>();
		al.add(new A34_UniqueEmployees(111,"Vaishnavi"));
		al.add(new A34_UniqueEmployees(222, "Kapil"));
		al.add(new A34_UniqueEmployees(111,"Vaishnavi"));
		al.add(new A34_UniqueEmployees(333,"Atharva"));
		al.add(new A34_UniqueEmployees(111,"Vaishnavi"));
		System.out.println(al.size());
	}

}
