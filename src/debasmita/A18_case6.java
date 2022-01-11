package debasmita;

public class A18_case6 {

	public static void main(String[] args) {
		A18_InheritanceBMW b1=new A18_InheritanceBMW();
		A18_InheritanceCar a1=new A18_InheritanceBMW();
        b1=(A18_InheritanceBMW)a1;
        //Here external typecasting is used,as we wre trying to fix parent object in a child reference variable.
        System.out.println(b1.efficiency);
        System.out.println(b1.initFuel);
        System.out.println(b1.registrationNo);
        b1.start();
        b1.stop();
        b1.refuel();
	}

}
