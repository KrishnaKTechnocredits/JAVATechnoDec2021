package shital.A18_Inheritance;

public class Case5_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new A();
		B b1=new B();
		a1=b1;
		System.out.println("x is = "+a1.x); //15 (parent class A value)
		System.out.println("y is = "+a1.y); //12 (parent class A value)
		//System.out.println("z is ="+a1.z); //CE
		/*not accessible because z variable is property of child class/Class B. 
		So this method are not accessible to parent class or class A*/
		
		
		
		a1.add(); //Sum of X & Y is :60 (child class value 50+10=60)
		a1.minimize(); //subtraction of X & Y  is:3 (From class A/parent class 15-12 =3)
		//a1.multiplication(); //CE
		/*not accessible because multiplication method is property of child class/Class B. 
		So this method are not accessible to parent class or class A*/
	}

}
