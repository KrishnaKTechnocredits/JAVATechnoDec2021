package vivek;

class A3_Calculate{
	
	void calculateInterest(double principal,double time,double rate){
		double simpleInterest = (principal * time * rate) / 100;
		System.out.println(simpleInterest);
	}
	
	void temperatureConvresion(double fahrenheit){
		double celcius = (fahrenheit - 32)* 5 / 9;
		System.out.println(celcius);
	}
	
	public static void main(String[] args){
		A3_Calculate example = new A3_Calculate();
		example.calculateInterest(20.5,2.5,5.2);
		example.temperatureConvresion(32.5);
	}
}