class Calculator1{
	
	void add(int num1,int num2){
	    int ans = num1+num2;
		System.out.println("Addition of two num is " +ans);
	}
	
	void sub(int num1,int num2){
		int ans = num1-num2;
		System.out.println("Substarction of two num is " +ans);
	}
	
	void mult(int num1,int num2){
		int ans = num1*num2;
		System.out.println("Multiplication of two num is " +ans);
	}
	
	void div(int num1,int num2){
	    int ans = num1/num2;
		System.out.println("Division of two num is " +ans);
	}
	
	public static void main (String[] args){
		Calculator1 calc = new Calculator1();
		calc.add(10,2);
		calc.sub(10,2);
		calc.mult(10,2);
		calc.div(10,2);
	}
	
}