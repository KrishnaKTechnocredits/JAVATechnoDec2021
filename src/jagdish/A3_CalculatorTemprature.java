package jagdish;
class A3_CalculatorTemprature{
	
	void interest( int p, int t, int r){
		int ans = (p * t * r) /100 ;
		System.out.println("Interest is : "+ans);	
	}
	
	void temprature(double fahrenheit ){
		double ans = (fahrenheit - 32)* 5/9;
		System.out.println("Celsius is :" +ans);
	}
	
	public static void main(String [] args){
		A3_CalculatorTemprature calculatortemprature = new A3_CalculatorTemprature();
		calculatortemprature.interest(22,40,30);
		calculatortemprature.temprature(63);
	}
}