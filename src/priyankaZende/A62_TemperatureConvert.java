package priyankaZende;
class A62_TemperatureConvert{
	void fahrenheitToCelsiusConvert(float fahrenheit){
		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius degree temperature is: " + celsius );
	}
	
	public static void main(String[] args){
		A62_TemperatureConvert temperatureConvert = new A62_TemperatureConvert();
		temperatureConvert.fahrenheitToCelsiusConvert(12.5f);
	}
}	