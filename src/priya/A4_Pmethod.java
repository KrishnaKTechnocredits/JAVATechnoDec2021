package priya;

public class A4_Pmethod {
	void simpleInt(int p, int t, double r) {
		double ans = (p * t * r) / 100;
		System.out.println("Simple Interest is : " + ans);
	}

	void tempC(double fahrenheit) {
		double celcius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature is celcius is : " + celcius);
	}

	public static void main(String[] args) {
		A4_Pmethod p1 = new A4_Pmethod();
		p1.simpleInt(100, 15, 1.5);
		p1.tempC(50);
	}
}
