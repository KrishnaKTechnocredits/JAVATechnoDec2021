package shital;

class A2_WithoutParameter{
	int num1=10;
	int num2=2;
	
	void add(){
		int ans=num1+num2;
		System.out.println("Addition is: "+ans);
	}
	
	void substraction(){
		int ans=num1-num2;
		System.out.println("Substraction is: "+ans);
	}
	
	void multiplication(){
		int ans=num1*num2;
		System.out.println("Multiplication is: "+ans);
	}
	
	void division(){
		int ans=num1/num2;
		System.out.println("Division is: "+ans);
	}
	
	public static void main(String[] args){
		A2_WithoutParameter assignment2WithoutParameter=new A2_WithoutParameter();
		assignment2WithoutParameter.add();
		assignment2WithoutParameter.substraction();
		assignment2WithoutParameter.multiplication();
		assignment2WithoutParameter.division();
	}
}