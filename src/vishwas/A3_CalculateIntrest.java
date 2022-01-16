package vishwas;

class A3_CalculateIntrest{
	
	void simpleIntrest(double amount ,int time, float rate){
		double intrest = amount * time * rate / 100 ;
		System.out.println("Simple intrest is :" + intrest);	
	}
	
	void convertTemp(float fahrenheit){
		double celsius = (fahrenheit - 32) * 5 / 9 ;
		System.out.println("Temperature from Fahrenheit to Celsius degree is :" + celsius);
	}
	
	public static void main (String[]args){
		A3_CalculateIntrest calculateIntrest = new A3_CalculateIntrest();
		calculateIntrest.simpleIntrest(55700,3,12.5f);
		calculateIntrest.convertTemp(102.5f);	
	}
} 