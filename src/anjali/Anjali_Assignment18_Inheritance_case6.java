package anjali;

public class Anjali_Assignment18_Inheritance_case6 {
	
	public static void main(String[] args) {
		
	Anjali_Assignment18_Inheritance_A a = new Anjali_Assignment18_Inheritance_B();
	Anjali_Assignment18_Inheritance_B b = new Anjali_Assignment18_Inheritance_B();
	b= (Anjali_Assignment18_Inheritance_B) a;
	
	System.out.println(b.x);
    System.out.println(b.y);
    System.out.println(b.z);
    
    b.m1();
    b.m2();
    b.m3();
	

	
}



}
