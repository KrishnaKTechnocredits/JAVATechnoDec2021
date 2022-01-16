package shital.A18_Inheritance;

public class Case2_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b1=new B();
		System.out.println("x is = "+b1.x); //15 from parent class
		System.out.println("y is = "+b1.y); //50 whatever child class have(not taken value of parent class)
		System.out.println("z is ="+b1.z); //10 whatever child class have

		b1.add(); // 60 whatever child class have
		b1.minimize(); //3 traverse from parent class because this method is present in parent class only,
					 //So as it is picked from parent with value also
		b1.multiply(); //500 whatever child class have
	}
}
