package rashmi;

public class Asgmnt3 {
	void simpleInterest (double p, double t, double r){
		double simplInt = p*t*r/100;
		System.out.println("simple interest = " + simplInt);
		}
		
	void temperature(double fahrenheit){
		double celsius = (fahrenheit-32)*5/9;
		System.out.println("temperature from fahrenheit to celsius is " + celsius);
		}
		
	public static void main(String args[]){
		Asgmnt3 asgmnt3 = new Asgmnt3();
		asgmnt3.simpleInterest(1500,4,12);
		asgmnt3.temperature(250);
	}
	
}
