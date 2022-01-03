package anjali;

public class Assignment18_Inheritance_case6 {
	
	public static void main(String[] args) {
		
	Assignment18_Inheritance_A a = new Assignment18_Inheritance_B();
	Assignment18_Inheritance_B b = new Assignment18_Inheritance_B();
	b= (Assignment18_Inheritance_B) a;
	
	System.out.println(b.x);
    System.out.println(b.y);
    System.out.println(b.z);
    
    b.m1();
    b.m2();
    b.m3();
	

	
}



}
