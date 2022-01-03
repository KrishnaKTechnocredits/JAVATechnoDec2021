package anvit.Inheritance_Cases;

public class Case1 {
	
	public static void main(String[] args) {
		A18_Test1 c1 = new A18_Test1();
		System.out.println(c1.x);
		System.out.println(c1.y);
		//System.out.println(test1.z); CE Because z does not belong in class A18_Inheritance1

		c1.m1();
		c1.m2();
		//test1.m3(); // CE Because m3() does not belong in class A18_Test1
	}
}
