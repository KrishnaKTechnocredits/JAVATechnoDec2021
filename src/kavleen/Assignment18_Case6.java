package kavleen;

public class Assignment18_Case6 {

	public static void main (String[] args) {
		Assignment18_A a1 = new Assignment18_B();
		Assignment18_B b = new Assignment18_B();
		 b = (Assignment18_B)a1;
		    System.out.println(b.x);
		    System.out.println(b.y);
		    System.out.println(b.z);
		    
		    b.m1();
		    b.m2();
		    b.m3();
		
	}
}
