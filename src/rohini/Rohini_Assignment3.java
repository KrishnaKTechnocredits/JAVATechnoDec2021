package rohini;

/*Assignment - 3 : Create two parameterized methods in same class*/

class Rohini_Assignment3{

    void SimpleInterest(double Principle,int Year,double Rate){
	   double Simple_Interest = (Principle * Year * Rate) / 100;
	   System.out.println("Simple Interest: "+Simple_Interest);
	}

    void FahrenToCelsius(double fahrenheit){
	   double Celsius = (fahrenheit - 32) * 5 / 9;
	   System.out.println("Celsius: "+Celsius);
	}
    
	public static void main(String[] args){
		Rohini_Assignment3 dataType = new Rohini_Assignment3();
		dataType.SimpleInterest(1000,2000,1.5);
		dataType.FahrenToCelsius(34);
	}
		
}