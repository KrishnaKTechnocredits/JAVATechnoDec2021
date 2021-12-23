/*Assignment - 2 : 14th Dec'2021
Write a calculator program, all methods should take 2 parameters.
for example : void add(int num1, int num2){}*/


package pallavi;

class A2_CalculatorWithParameter{
		
	void add(int num1, int num2){
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}

	void sub(int num1, int num2){
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	
	void mul(int num1, int num2){
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}
	
	void div(int num1, int num2){
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}
	
	public static void main(String[] arr){
		A2_CalculatorWithParameter calculatorWithParameter=new A2_CalculatorWithParameter();
		calculatorWithParameter.add(12,34);
		calculatorWithParameter.sub(23,11);
		calculatorWithParameter.mul(32,10);
		calculatorWithParameter.div(32,8);
	}
}