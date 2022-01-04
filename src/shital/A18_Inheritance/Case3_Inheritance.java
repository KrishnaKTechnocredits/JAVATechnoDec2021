package shital.A18_Inheritance;

public class Case3_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new B();
		System.out.println("x is = "+a1.x); //15 whatever parent class have
		System.out.println("y is = "+a1.y); //12 whatever parent class have
		//System.out.println("z is ="+a1.z); //CE parent class taking guarantee from class A only. 
		//and this z is not present in class A or in parent class
	
		a1.add(); //Sum of X & Y is :60 The same method present in parent or child class
				 //value used as per in child class	and executed
		a1.minimize(); //subtraction of X & Y  is:3 whatever parent class have
		//a1.multiply(); //CE parent class taking guarantee from class A only. 
						//and this multiply is not present in class A or in parent class
	}
}
