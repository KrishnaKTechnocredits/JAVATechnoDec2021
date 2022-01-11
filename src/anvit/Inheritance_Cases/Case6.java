package anvit.Inheritance_Cases;

public class Case6 {
	
	public static void main(String[] args) {
		A18_Test1 c6_1 = new A18_Test2();
		A18_Test2 c6_2 = new A18_Test2();

		c6_2 = (A18_Test2) c6_1;
		// A18_Test2 c6_2 = new A18_Test2(); <- this is how object will be created
		System.out.println(c6_2.x);
		System.out.println(c6_2.y);
		System.out.println(c6_2.z);

		c6_2.m1();
		c6_2.m2();
	}
}
