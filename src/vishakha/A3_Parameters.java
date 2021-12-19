package vishakha;

class A3_Parameters{

	void simpleInterest(double p,double t, double r){
		double answer = p * t * r / 100 ;
		System.out.println("Simple interest is " + answer);
	}
	
	void convertTemp(double farenheit){
		double answer = (farenheit - 32) * 5/9;
		System.out.println("Farenheit to Celcius is " + answer);
	}
	public static void main(String[] args){
		A3_Parameters parameters = new A3_Parameters();
		parameters.simpleInterest(20000,3.5,14.8);
		parameters.convertTemp(40);
	}
}