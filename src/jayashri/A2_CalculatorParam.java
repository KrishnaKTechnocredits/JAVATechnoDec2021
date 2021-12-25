package jayashri;

class A2_CalculatorParam{

	void add(int num1, int num2){
		int ans1= num1 + num2;
	    System.out.println("Addition is "+ ans1);
   }
   
	void multiplication(int num1, int num2){
        int ans2= num1 * num2;
	    System.out.println("Multiplication is "+ ans2);
   }
   
	void substraction(int num1, int num2){
        int ans3= num1 - num2;
	    System.out.println("Substraction is "+ ans3);
   }
   
	void division(int num1, int num2){
        int ans4= num1 / num2;
	    System.out.println("Division is "+ ans4);
   }
    
	public static void main(String[] args){
		A2_CalculatorParam a2_calculatorParam = new A2_CalculatorParam();
		a2_calculatorParam.add(10,20);
		a2_calculatorParam.multiplication(2,3);
        a2_calculatorParam.substraction(5,2);
		a2_calculatorParam.division(20,2);		
    }
}