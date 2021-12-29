package samir;

class A2_CalculatorProgram
{
	int num1,num2;
	void add(int num1 , int num2 ){
	    int num3=num1+num2;
		System.out.println("Addition = " +num3 );
		
	}
		void sub(int num1 , int num2){
		  int num3=num1-num2;
		System.out.println("Subtraction = " +num3 );
	}
		void mul(int num1 , int num2){
		  int num3=num1*num2;
		System.out.println("Multiplication = " +num3 );
	}
		void div(int num1 , int num2){
		 int num3=num1/num2;
		System.out.println("Division = " +num3 );
	}
	
	public static void main(String[] args){
		A2_CalculatorProgram A2_CalculatorProgram1=new A2_CalculatorProgram();
		A2_CalculatorProgram1.add(5 ,5);
		A2_CalculatorProgram1.sub(5 ,5);
		A2_CalculatorProgram1.mul(5 ,5);
		A2_CalculatorProgram1.div(5 ,5);
		
			}
}

