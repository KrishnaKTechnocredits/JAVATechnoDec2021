package sham;
class A3_PTRclass{

	void ComputeSimpleInterest(double amount, double time,double rate){
		double simpleInterest= amount*time*rate/100;
		System.out.println("simple interest for "+time +" is: "+simpleInterest);

	}
	
	void FahrenheittoCelsius(double fahrenheit){
		double celcius= (fahrenheit-32)*5/9;
		
		System.out.println("Fahrenheit to Celsius is : "+celcius);
	}
	
	public static void main(String[] args){
		A3_PTRclass ptr= new A3_PTRclass();
		ptr.ComputeSimpleInterest(5000,5,10);
		ptr.FahrenheittoCelsius(45);
	}
}

