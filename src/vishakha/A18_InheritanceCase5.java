package vishakha;

public class A18_InheritanceCase5 {
	public static void main(String[] args) {
		A18_InheritanceA a = new A18_InheritanceA();
		A18_InheritanceB b = new A18_InheritanceB();
		 a = b;
		 System.out.println(a.x);
		 System.out.println(a.y);
		 //System.out.println(a,z);----------------CE
		 
		 
		 a.m1();
		 a.m2();
		 //a.m3();---------------CE
		 
	}
}
