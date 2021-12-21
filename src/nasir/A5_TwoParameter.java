package nasir;
class A5_TwoParameter{
	void simpleInterest(double p, int t, double r){
		double Interest=(p*t*r)/100;
		System.out.println("Total interest is "+Interest+" Rupees");
	}
	
	void temperature(double fahrenheit ){
		double Celecius=(fahrenheit-32)*5/9;
		System.out.println("Temperature in celcius is "+Celecius+" C*");
	}
	
	public static void main(String[]args){
		A5_TwoParameter twoparameter =new A5_TwoParameter();
		twoparameter.simpleInterest(100,2001,6.5);
		twoparameter.temperature(99.9);
	}
}