package anjali;

public class A2_CalulatorWithParametrs {

	public static void main(String[] args) {
		A2_CalulatorWithParametrs calculatorWithInputParametrs = new A2_CalulatorWithParametrs();
		calculatorWithInputParametrs.addition(10,20);
		calculatorWithInputParametrs.substraction(10,20);
		calculatorWithInputParametrs.mutiplication(10,20);
		calculatorWithInputParametrs.division(10,20);
    }
	
	void addition(int x, int y){
		int addition=x+y;
		System.out.println("The addition of given 2 numbers is: "+ addition);
	}
	void substraction(int x, int y){
		int substraction=x-y;
		System.out.println("The Substraction of given 2 numbers is: "+ substraction);
	}
	
	void mutiplication(int x, int y){
		int mutiplication=x*y;
		System.out.println("The mutiplication of given 2 numbers is: "+ mutiplication);
	}
	
	void division(int x, int y){
		double division=x/y;
		System.out.println("The division of given 2 numbers is: "+ division);
	}
}
