package hevin;

public class A18_Case1 {
	public static void main(String[] args) {
		A18_Inheritance1 test1 = new A18_Inheritance1();

		System.out.println(test1.x);
		System.out.println(test1.y);
		//System.out.println(test1.z); CE Because z is not a member of class A18_Inheritance1

		test1.m1();
		test1.m2();
		//test1.m3(); // CE Because m3() is not a member of class A18_Inheritance
	}
}

