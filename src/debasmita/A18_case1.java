package debasmita;

public class A18_case1 {

	public static void main(String[] args) {
		A18_InheritanceCar a1= new A18_InheritanceCar();
       System.out.println(a1.registrationNo);
       System.out.println(a1.initFuel);
      // System.out.println(a1.efficiency);
       /*efficiency is not the property/variable of class InheritanceCar-Compilation error*/
       
       a1.start();
       a1.stop();
       //a1.refuel();-Compilation error,refuel is not the behaviour/method of class InheritanceCar.
	}

}
