package krishna;

class Calculation{
	
	void simpleInterest(int P, int T, float R){
		double ans = (P*R*T)/100;
		double SimpleInterest = ans;
		System.out.println("The SimpleInterest is  " + SimpleInterest);
	}
	
	void temperature(float fahrenheit){
		double ans = (fahrenheit - 32)*5/9;
		double celcius = ans;
		System.out.println("The Converted Temperature is  " + celcius);
	}
	
	public static void main (String[] args){
		Calculation calculation = new Calculation();
		calculation.simpleInterest(12, 30, 50);
		calculation.temperature(52);
	}
}
