package ashutosh;

class A2_calculator2{

	void add (int num1, int num2){
		int addition=(num1+num2);
		System.out.println(addition);
	}
	
	void sub (int num1, int num2){
		int subtraction=(num1-num2);
		System.out.println(subtraction);
	}
	
	void mul (int num1, int num2){
		int multiply=(num1*num2);
		System.out.println(multiply);
	}
	
	void div (int num1, int num2){
		float division=(num1/num2);
		System.out.println(division);
	}
	
	public static void main(String args []){
		A2_calculator2 calculator2=new A2_calculator2();
		calculator2.add(10,20);
		calculator2.sub(10,20);
		calculator2.mul(10,20);
		calculator2.div(100,20);
	}

}