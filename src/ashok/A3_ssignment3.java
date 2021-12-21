package ashok;
class CalIntrest{

	void intrest(int P, int T, int R){
		long simint = (P * T * R)/100;
		System.out.println("Simple intrest: " + simint);
	}
	
	void celcius(double fahrenheit){
		double cel = (fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius is: " + cel);
	}
	
	public static void main(String[] args){
		CalIntrest calIntrest = new CalIntrest();
		calIntrest.intrest(1000,2,7);
		calIntrest.celcius(99.9);
	}
}