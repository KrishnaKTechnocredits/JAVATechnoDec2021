package vrushali;

public class A18_Case1 {
	public static void main(String[] args) {
		A18_Test1 test1 = new A18_Test1();
		
		System.out.println(test1.x);
		System.out.println(test1.y);
		//System.out.println(test1.z); Compile time error as z is not a member of class A18_Test1
		
		test1.m1();
		test1.m2();
		//test1.m3(); // CE as m3() is not a member of class A
	}
}
