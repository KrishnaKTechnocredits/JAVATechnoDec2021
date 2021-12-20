class Calculator1 {
	
	void additon (int num1, int num2) {
		int ans = num1+num2;
		System.out.println("Additon of "+num1+" and "+num2+" is: " +ans);
	}
	
	void subtract (int num1, int num2) {
		int ans = num1-num2;
		System.out.println("Subtraction of "+num1+" and "+num2+" is: " +ans);
	}
	
	void multiply (int num1 , int num2) {
		int ans = num1*num2;
		System.out.println("Multiplication of "+num1+" and "+num2+" is: " +ans);
	}
	
	void division (int num1 , int num2) {
		int ans = num1/num2;
		System.out.println("Division of "+num1+" and "+num2+" is: " +ans);
	}
	
	public static void main (String[] args) {
		Calculator1 calculator1 = new Calculator1();
		calculator1.additon(10,20);
		calculator1.subtract(30,15);
		calculator1.multiply(101,20);
		calculator1.division(20,5);
	}
}