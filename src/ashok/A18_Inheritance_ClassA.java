package ashok;

public class A18_Inheritance_ClassA {
	
	int x = 10;
	int y = 12;
	
	void classm1() {
		System.out.println("I am in ClassA M1 method");
	}
	
	void classm2() {
		System.out.println("I am in ClassA M2 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A18_Inheritance_ClassA a1 = new A18_Inheritance_ClassA();
		System.out.println(a1.x);
		System.out.println(a1.y);
		
		a1.classm1();
		a1.classm2();
		//a1.classm3();
		System.out.println("********** CASE 2 *********");
		A18_Inheritance_ClassB b1 = new A18_Inheritance_ClassB();
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
		b1.classm1();
		b1.classm2();
		b1.classm3();
		System.out.println("********** CASE 3 *********");
		A18_Inheritance_ClassA c1 = new A18_Inheritance_ClassB();
		System.out.println(c1.x);
		System.out.println(c1.y);
		c1.classm1();
		c1.classm2();
		System.out.println("********** CASE 4 - Invalid case*********");
		//A18_Inheritance_ClassB d1 = new A18_Inheritance_ClassA();
		//Type mismatch: cannot convert from A18_Inheritance_ClassA to A18_Inheritance_ClassB
		System.out.println("Type mismatch: cannot convert from A18_Inheritance_ClassA to A18_Inheritance_ClassB");
		System.out.println("********** CASE 5 *********");
		A18_Inheritance_ClassA aa1 = new A18_Inheritance_ClassA();
		A18_Inheritance_ClassB bb1 = new A18_Inheritance_ClassB();
		aa1 = bb1;
		System.out.println(aa1.x);
		System.out.println(aa1.y);
		//System.out.println(aa1.z);z cannot be resolved or is not a field
		System.out.println("z cannot be resolved or is not a field");
		aa1.classm1();
		aa1.classm2();
	}

}
