package hevin;

public class A18_Case3 {
	public static void main(String[] args) {

		A18_Inheritance1 test1 = new A18_Inheritance2();

			System.out.println(test1.x);
			System.out.println(test1.y);
			//System.out.println(test1.z); CE because z is not the member of class A18_Inheritance1

			test1.m1();
			test1.m2();
			// test1.m3(); CE m3() is not the member of class A18_Inheritance1
	}
}