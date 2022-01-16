package prajakta;

public class A18_Case1 {
       public static void main(String[] args) {
    	      A18_ClassA a1 = new A18_ClassA();
    	      System.out.println(a1.x);
    	      System.out.println(a1.y);
    	      // System.out.println(a1.z); CE as z is not a member of class A
    	      
    	      a1.m1();
    	      a1.m2();
    	      // a1.m3(); CE as m3() is not a member of class A
       }
}
