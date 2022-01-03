package vishakha;

public class A18_InheritanceCase6 {
	public static void main(String[] args) {
		A18_InheritanceA a = new A18_InheritanceB();
		A18_InheritanceB b = new A18_InheritanceB();
		b = (A18_InheritanceB) a;
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		
		b.m1();
		b.m2();
		b.m3();
	}
	
	
}
