package debasmita;

public class A18_case2 {

	public static void main(String[] args) {
		A18_InheritanceBMW b1=new A18_InheritanceBMW();
		System.out.println(b1.registrationNo);
		System.out.println(b1.efficiency);
		System.out.println(b1.initFuel);
		b1.start();
		b1.stop();
		b1.refuel();
        /* All variables and properties of both class A18_InheritanceCar and class A18_InheritanceBMW are accesible 
		   as A18_InheritanceBMW is the child class of A18_InheritanceCar.*/
	}    

}
