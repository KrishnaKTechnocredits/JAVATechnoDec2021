package vaishnavi;

class A2_Calculator5{
	
	void add(int a, int b){
		int ans = a + b;
	    System.out.println("Addition is "+ans);
	}
	
	void sub(int a, int b){
		int ans = a - b;
	    System.out.println("Substraction is "+ans);
	}
	
	void mul(int a, int b){
		int ans = a * b;
	    System.out.println("Multiplication is "+ans);
	}
	
	void div(int a, int b){
		int ans = a / b;
	    System.out.println("Division is "+ans);
	}
	
	public static void main(String[] args){
		A2_Calculator5 calculator5 = new A2_Calculator5();
		calculator5.add(20,40);
		calculator5.sub(60,40);
		calculator5.mul(14,30);
		calculator5.div(40,2);
	}
}
	