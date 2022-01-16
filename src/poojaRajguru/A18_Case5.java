package poojaRajguru;

public class A18_Case5 {

public static void main(String[] args) {
		
		A18_InheritanceClassA a1 = new A18_InheritanceClassA();
		A18_InheritanceClassB b1 = new A18_InheritanceClassB();
		a1=b1;
			
		System.out.println(a1.x);
		System.out.println(a1.y);
		//System.out.println(a1.z);//Accessing Class B variable on reff of Class A
				
		a1.m1();
		a1.m2();
		//a1.m3();//Calling Class B method on reff of Class A
	}
}
/*like case 3 it will calls or overrides the
 *  methods of class A but can not overrride the 
 *  variables i.e properties of class A*/

