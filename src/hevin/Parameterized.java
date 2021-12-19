package hevin;

class Parameterized{

	void simpleInterest(float P, int T, double R){
		double SI=(P*R*T)/100;
		System.out.println("Simple Interest = " + SI);
	}
	
	void temperature(int fahrenheit){
		int temp = (fahrenheit - 32)*5/9;
		System.out.println("Temperature In Celcius = " + temp);
	}
	
	public static void main(String[] a){
		Parameterized parameterized = new Parameterized();
		parameterized.simpleInterest(10000, 10, 12.5);
		parameterized.temperature(99);
	}
}