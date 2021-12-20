package saurav;

class SimpleInterestAndTemp{

	void simpleInterest(int principleAmt, int time, double rate){
		double simpleInterest = (principleAmt*time*rate)/100;
		System.out.println("SI = "+ simpleInterest);
	}

	void temperatureConversion(double fahrenheit){
		double celsius = (fahrenheit-32)*5/9;
		System.out.println("Temperature in Celsius = "+celsius);
	}
	
	public static void main(String[] a){
		SimpleInterestAndTemp simpleinterestandtemp = new SimpleInterestAndTemp();
		simpleinterestandtemp.simpleInterest(4000,2,5.5);
		simpleinterestandtemp.temperatureConversion(60);
	}
}