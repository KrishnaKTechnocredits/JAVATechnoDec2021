package kavleen;

public class Assignment18_Case5 {
	public static void main (String [] args) {
		
		Assignment18_A a1 = new Assignment18_B();
		Assignment18_B b = new Assignment18_B();
		    a1 = b;

	        System.out.println(a1.x);
	        System.out.println(a1.y);
	      //System.out.println(a1.z);     //It will give a compilation error
	        
	        a1.m1();
	        a1.m2();
	     // a1.m3();         ////It will give a compilation error
		}
	}
