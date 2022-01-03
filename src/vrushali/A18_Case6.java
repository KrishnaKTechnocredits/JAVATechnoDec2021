package vrushali;

public class A18_Case6 {
	
	public static void main(String[] args) {
		
		A18_Test1 test1 = new A18_Test2();
		A18_Test2 test2 = new A18_Test2();
		
		test2 = (A18_Test2) test1;
		
		System.out.println(test2.x);
		System.out.println(test2.y);
		System.out.println(test2.z);
		
		test2.m1();
		test2.m2();
		test2.m3();
	}
}
