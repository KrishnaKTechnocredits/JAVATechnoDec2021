package shital;

class A3{
	
	void simpleInterest(float p, float r, float t){
		float ans=(p*r*t)/100;
		System.out.println("calculate Simple Interest is: " +ans);
	}
	
	void temperature(float fahrenheit){
		float celcius=(fahrenheit-32)*5/9;
		System.out.println("Temperature is: " +celcius);
	}
	
	public static void main(String[] args){
		A3 assignment3=new A3();
		assignment3.simpleInterest(112000,2,14);
		assignment3.temperature(24);
	}
}