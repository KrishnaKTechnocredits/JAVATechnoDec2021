package poojaRajguru;

public class A18_Case3 {

public static void main(String[] args) {
		
		A18_InheritanceClassA a1 = new A18_InheritanceClassB();
		
		System.out.println(a1.x);
		System.out.println(a1.y);
		//System.out.println(a1.z); // B class variable
				
		a1.m1();
		a1.m2();
		//a1.m3();// B class method
	}
}
