package jagdish;
class A1_CalulatorInfo
{	
	void add(int num1,int num2){
		int ans = num1+num2;
		System.out.println("Addition of Number is " +ans);
	}
	
	void sub(int num1 , int num2){
		int ans = num1 - num2;
		System.out.println("Subtraction of Number is "+ans);
	}
		
	void multi(int num1 , int num2){
		int ans = num1 * num2;
		System.out.println("Multiplcation of Number is " +ans);
	}
		
	void div(int num1 , int num2){
		int ans = num1 / num2;
		System.out.println("Division of Number is " +ans);
	}
	
	public static void main(String [] args){
		A1_CalulatorInfo calculatorinfo = new A1_CalulatorInfo();
		calculatorinfo.add(100,200);
		calculatorinfo.sub(500,300);
		calculatorinfo.multi(300,5);
		calculatorinfo.div(1000,500);
	}
}