package anvit.Inheritance_Cases;

public class Case3 {
	
	public static void main(String[] args) {
		A18_Test1 c3 = new A18_Test2();
		System.out.println(c3.x);
		System.out.println(c3.y);
		//System.out.println(c3.z); CE because z does not belong in class A18_Test1

		c3.m1();
		c3.m2();
	}
	
}
