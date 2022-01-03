package hevin;

public class A18_Case5 {
	public static void main(String[] args) {

		A18_Inheritance1 test1 = new A18_Inheritance1();
		A18_Inheritance2 test2 = new A18_Inheritance2();

		test1 = test2;

		System.out.println(test1.x );
		System.out.println(test1.y);
		//System.out.println(test1.z); //CE : z is not a member of class A18_Inheritance1

		test1.m1();
		test1.m2();
		//test1.m3(); CE as m3() is not a member of class A18_Inheritance1
	}
}
