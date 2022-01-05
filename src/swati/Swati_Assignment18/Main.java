package swati.Swati_Assignment18;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--Case 1--");
		Case1 C1=new Case1();
		System.out.println("A X " +C1.x);
		System.out.println("A Y " +C1.y);
		C1.m1();
		C1.m2();
		System.out.println("--Case 2--");
		Case2 C2=new Case2();
		System.out.println("A X " +C2.x);
		System.out.println("B Y " +C2.y);
		System.out.println("B Z " +C2.z);
		C2.m1();
		C2.m2();
		C2.m3();
		System.out.println("--Case 3--");
		Case1 C3=new Case2();
		System.out.println("A X " +C3.x); // Parent class value will be displayed as values cannot be ovverridden
		System.out.println("A Y " +C3.y);// Parent class value will be displayed as values cannot be ovverridden
		//System.out.println("B Z " +C3.z); z is not available in Parent class
		C3.m1();
		C3.m2();//Child class method will be displayed
		//C3.m3(); // m3 is not available in Parent class
		
		System.out.println("--Case 4--");
		//Case2 C4=new Case1();// Left hand sid should be parent and right hand should be child. Conversionc cannot happen from child to parent
		
		System.out.println("--Case 5--");
		//Like Case3
		Case1 C5=new Case1();
		Case2 C6=new Case2();
		C5=C6;
		System.out.println("A X " +C3.x); // Parent class value will be displayed as values cannot be ovverridden
		System.out.println("A Y " +C3.y);// Parent class value will be displayed as values cannot be ovverridden
		//System.out.println("B Z " +C3.z); //z is not available in Parent class
		C3.m1();
		C3.m2();//Child class method will be displayed
		//C3.m3(); // m3 is not available in Parent class
		
		System.out.println("--Case 6--");
		Case1 c7=new Case2();
		Case2 c8=new Case2();
		// Case2 c8=new Case2();
		c8=(Case2)c7;
		System.out.println(c8.x);
		System.out.println(c8.y);
		System.out.println(c8.z);
		c8.m1();
		c8.m2();
		c8.m3();
		Case1 C9=new Case3();
		
		
		
		
		
	}

}
