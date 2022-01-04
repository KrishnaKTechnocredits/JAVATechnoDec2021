package shital.A18_Inheritance;

public class Case6_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1=new B();
		B b1=new B();
		//b1 = a1; //Type mismatch: can not convert
		System.out.println("x is = "+b1.x); //15 from parent class have
		System.out.println("y is = "+b1.y); //50 whatever child class have
		System.out.println("z is ="+b1.z); //10 whatever child class have

		b1.add(); //60 (50+10)
		b1.minimize(); //3 (From class A 15-12 =3)
		b1.multiply(); //  500 (From child class 50*10)
	}

}
