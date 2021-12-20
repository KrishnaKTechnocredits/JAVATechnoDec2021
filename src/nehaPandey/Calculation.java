package nehaPandey;

class Calculation {

	void SimpleInterest(double principleamount, double time, double rate) {
		double simpleinterest = (principleamount * time * rate) / 100;
		System.out.println("Simple Interest is : " + simpleinterest);
	}

	void ConvertTemperature(double Fahrenheit) {
		double celsius = (Fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in Celsius is : " + celsius);
	}

	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.SimpleInterest(100, 98, 99);
		cal.ConvertTemperature(98);
	}
}