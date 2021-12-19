package apurva;

class Calculation{

	void calculateSimpleInterest(float p, float t, float r){
		float simpleInterest = (p*t*r)/100;
		System.out.println("Calculated Simple interest is :" +simpleInterest);
	}
	
	void calculateTempreature(float fahrenheit){
		float celcius = (fahrenheit-32)*5/9;
		System.out.println("Converted tempreature:" +celcius);
	}
	
	public static void main(String[] a){
		Calculation calculation = new Calculation();
		calculation.calculateSimpleInterest(40f,9f,12f);
		calculation.calculateTempreature(42f);
	}
	
}