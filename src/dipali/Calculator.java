package dipali;

public class Calculator {
	int number1 = 10;
	int number2 = 2;

void add(){
	int ans =  number1+number2;
	System.out.println("Addition is "+ ans);
}
	
void sub(){
	int ans =  number1-number2;
	System.out.println("substration is "+ ans);
}
	
void mul(){
	int ans =  number1*number2;
	System.out.println("Multiplication is "+ ans);
}
	
void dev(){
	int ans =  number1/number2;
	System.out.println("devision is "+ ans);
}	

public static void main(String[] args){
	Calculator calculator = new Calculator();
	calculator.add();
	calculator.sub();
	calculator.mul();
	calculator.dev();
}
}

