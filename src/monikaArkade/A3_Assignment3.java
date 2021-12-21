package monikaArkade;

class A3_Assignment3{
	
	void simpleInterest(double principle, double time, double rate){
		double simpleInterest = (principle * time * rate)/100;
		System.out.println(simpleInterest);
	}
	
	void  temperature(double fahrenheit){
		double celsius = (fahrenheit - 32) * 5/9;
		System.out.println(celsius);
	}
	
	public static void main(String[] args){
		A3_Assignment3 assignment3 = new A3_Assignment3();
		assignment3.simpleInterest(10000,3.5,9);
		assignment3.temperature(65);
	}
}