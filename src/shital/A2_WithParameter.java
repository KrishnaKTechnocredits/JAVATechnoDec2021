package shital;

class A2_WithParameter{
	
	void add(int num1, int num2){
		int ans=num1+num2;
		System.out.println("Addition is: " +ans);
	}
	
	void substraction(int num1, int num2){
		int ans=num1-num2;
		System.out.println("Substarction is: " +ans);
	}
	
	void multiplication(int num1, int num2){
		int ans=num1*num2;
		System.out.println("Multiplication is: " +ans);
	}
	
	void division(int num1, int num2){
		int ans=num1/num2;
		System.out.println("Division is:" +ans);
	}
	
	public static void main(String[] args){
		A2_WithParameter assignment2WithParameter=new A2_WithParameter();
		assignment2WithParameter.add(50,5);
		assignment2WithParameter.substraction(15,3);
		assignment2WithParameter.multiplication(10,6);
		assignment2WithParameter.division(15,3);
	}

}