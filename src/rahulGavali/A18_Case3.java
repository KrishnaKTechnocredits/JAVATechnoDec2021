package rahulGavali;

public class A18_Case3 {

	public static void main(String[] args) {
		A18_Parent parent = new A18_Child();
		System.out.println(parent.x);
		System.out.println(parent.y); //compile time to runtime properties do not changes, therefore it take value of y from parent class.
//		System.out.println(parent.z); //on parent reference var. only members of Parent class is available, - this member is from child class, so not visible.
		parent.m1();
		parent.m2();	//compile time to runtime behavior changes, therefore m2() of child class get executed here. 
//		parent.m3();	//on parent reference var. only members of Parent class is available, - this member is from child class, so not visible.
	}
}