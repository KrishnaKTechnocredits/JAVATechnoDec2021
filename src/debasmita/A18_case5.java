package debasmita;

public class A18_case5 {

	public static void main(String[] args) {
		A18_InheritanceCar a1 = new A18_InheritanceCar();
		A18_InheritanceBMW b1= new A18_InheritanceBMW();
		a1=b1;//This means , A18_InheritanceCar a1=new A18_InheritanceBMW();
		System.out.println(a1.registrationNo);
		System.out.println(a1.initFuel);
		//System.out.println(a1.efficiency);Compilation error,reference variable cannot see initfuel variable.
		a1.start();
		a1.stop();
		//a1.refuel();Compilation error,reference variable cannot see refuel method
     /*During compile to runtime methods get changed,output will be of child class*/
	}

}
