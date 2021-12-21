package yogeshNagar;

class A4_Parameterization{
	
	void simpleInterest(double principle, double rate, double time){
		double simpleInterest = (principle * rate * time)/100;
		System.out.println("Simple Interest is " + simpleInterest);		
	}
	
	void tempratureConversion(double fahrenheit){
		double  celsius = (fahrenheit - 32) * 5/9;
		System.out.println("Temprature in Celsius is " + celsius);		
	}
	
	public static void main(String[] args){
		A4_Parameterization parameterization = new A4_Parameterization();
		parameterization.simpleInterest(1000,11.2,4);
		parameterization.tempratureConversion(104);
	}
}