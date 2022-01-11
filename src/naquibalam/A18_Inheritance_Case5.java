package naquibalam;

public class A18_Inheritance_Case5 {

	public static void main(String[] args) {
		A18_Inheritance_Parent parent = new A18_Inheritance_Parent();
		A18_Inheritance_Child child = new A18_Inheritance_Child();
		parent = child;
		System.out.println(parent.x);
		System.out.println(parent.y);
		//System.out.println(parent.z);
		
		parent.m1();
		parent.m2();
		//parent.m3();
	}
}
