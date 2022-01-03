package vaishnavi;

public class A18_Case3 {

	public static void main(String[] args) {

		A18_Test1 test1 = new A18_Test2();

			System.out.println(test1.x);
			System.out.println(test1.y);
			//System.out.println(test1.z); Compile time error as z is not the member of class A18_Test1.

			test1.m1();
			test1.m2();
			// test1.m3(); Compile time error as m3()is not the member of class A18_Test1.			
	}
}
