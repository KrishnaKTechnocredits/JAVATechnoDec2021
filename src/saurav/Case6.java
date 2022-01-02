package saurav;

public class Case6 {
	
	public static void main(String[] a) {
		Manager m1 = new Employee();
		Employee e1 = new Employee();
	e1 =(Employee) m1;         //   it is case 2  need type casting    CE as here we are trying to assign ref var of manager class into ref var of employee class which is not acceptable
		System.out.println(e1.x);
		System.out.println(e1.y);
		System.out.println(e1.z);
		e1.m1();
		e1.m2();
		e1.m3();	
	}
}
