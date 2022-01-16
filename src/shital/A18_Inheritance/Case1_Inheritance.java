package shital.A18_Inheritance;

public class Case1_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A();
		System.out.println("x is = "+a1.x); //15
		System.out.println("y is = "+a1.y); //12
		//System.out.println("z is ="+a1.z); //CE
		/*not accessible because z variable is property of child class/Class B. 
		So this method are not accessible to parent class or class A. 
		So during compilation the same is not accessible.*/
		 
		
		a1.add(); //Sum of X & Y is :27
		a1.minimize(); //subtraction of X & Y  is:3
		//a1.multiplication(); //CE
		/*not accessible because multiplication method is property of child class/Class B. 
		So this method are not accessible to parent class or class A*/
	}

}
