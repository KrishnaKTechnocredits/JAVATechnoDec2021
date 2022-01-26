package rahulGavali;

public class A18_Case6 {

	public static void main(String[] args) {
		A18_Parent parent = new A18_Child();
		A18_Child child = new A18_Child();
//		child = parent; //Here type casting is required, similar to assigning the double value to int value. 
		child = (A18_Child) parent;	//similar to A18_Child child = new A18_Child()  
		System.out.println(child.x); // Parent properties travel to child class
		System.out.println(child.y);
		System.out.println(child.z);
		child.m1();	  //Parent properties travel to child class
		child.m2();
		child.m3();
	}
}