package anvit.Inheritance_Cases;

public class Case5 {
	public static void main(String[] args) {
		A18_Test1 c5_1 = new A18_Test1();
		A18_Test2 c5_2 = new A18_Test2();

		c5_1 = c5_2;
		// A18_Test1 c5_1 = new A18_Test2(); <- this is how object will be created 
		System.out.println(c5_1.x );
		System.out.println(c5_1.y);
		//System.out.println(c5_1.z); //CE : z does not belong in class A18_Test1

		c5_1.m1();
		c5_1.m2();
		
	}
	
}
