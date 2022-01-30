package kavleen;

public class Assignment18_Case3 {
	public static void main (String [] args) {
	Assignment18_A a1 = new Assignment18_B();
	System.out.println(a1.x);
	System.out.println(a1.y);
	//System.out.println(a1.z);  //will give compilation error , because only Class A one's will be executed.
	a1.m1();
	a1.m2();
	//a1.m3(); // it will give compilation error
	}
	
	
}