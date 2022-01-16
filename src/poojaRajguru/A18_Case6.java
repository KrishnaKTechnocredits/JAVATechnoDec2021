package poojaRajguru;

public class A18_Case6 {

public static void main(String[] args) {
		
		A18_InheritanceClassA a1 = new A18_InheritanceClassA();
		A18_InheritanceClassB b1 = new A18_InheritanceClassB();
//		b1=a1;// can not assign parent class to child child class
		 //need typecasting here
			
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
				
		b1.m1();
		b1.m2();
		b1.m3();
	}
}
/*like case 4 we can not create class A object i.e 
 * parent class object with refference of child class*/

