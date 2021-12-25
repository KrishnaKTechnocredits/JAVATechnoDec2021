package jayashri;

class A3_Parammethods{

	void simpleInterest(int pamount, int time, float rate){
		double interest = (pamount * time * rate)/100;
		System.out.println("Simple Interest is: " + interest);
	}
	
	void conversion(double fahrenheit){
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Conversion of Fahrenheit to Celsius: " + celsius);
	}
	
	public static void main (String[] args){
		A3_Parammethods a3_parammethod = new A3_Parammethods();
		a3_parammethod.simpleInterest(28, 4, 4.3f);
		a3_parammethod.conversion(98.6);
	}
}