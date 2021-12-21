package megha;

class Formula{
	
	void simpleInterest(double principal, double time, double rate){
		double simpleInterest = principal*time*rate/100;
		System.out.println("Simple Interest is : " + simpleInterest);
	}
	
	void temperature(double fahrenheit){
		double celsius = (fahrenheit - 32)*5/9;
		System.out.println("Temperature in Celsius is : " + celsius);
	}
	
	public static void main(String[] args){
		Formula formula = new Formula();
		formula.simpleInterest(10000, 2.5, 10);
		formula.temperature(75);
	}
}