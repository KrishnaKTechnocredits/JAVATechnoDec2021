package anjali;

public class Assignment18_Inheritance_case3 {

	public static void main(String[] args) {
		Assignment18_Inheritance_A a = new Assignment18_Inheritance_B();
		System.out.println(a.x);
        System.out.println(a.y);
      //System.out.println(a.z);...Here is compilation error
        a.m1();
        a.m2();
      //a.m3();...Here is compilation error

	}

}
