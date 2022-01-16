package debasmita;

public class A18_case3 {

	public static void main(String[] args) {
		A18_InheritanceCar a1 = new A18_InheritanceBMW();
		System.out.println(a1.initFuel);
		System.out.println(a1.registrationNo);
		//System.out.println(a1.efficiency);-Compilation error
		
		a1.start();
		a1.stop();
		//a1.refuel();-Compilation error
         
		/*Here,reference variable will take the guarantee of class A18_InheritanceCar,Property/variable will not get changed,it will be binded 
          at the compile time while behaviour/method of the class will get changed.This phenonmenon is know as Dynamic Polymorphism*/
         
	}

}
