package naquibalam;

class A3_FormulaCheck{
	
	void simpleInterest(double principal, double time, double rate){
		double simpleInterest = (principal * time * rate) / 100;
		System.out.println("Simple Interest = " + simpleInterest);
	}
	
	void temperatureConvert(double fahrenheit){
		double celsius = (fahrenheit - 32) * 5/9;
		System.out.println(fahrenheit + " in Fahrenheit is equal to " + celsius + " in Celsius");
	}
	
	public static void main (String[] args){
		A3_FormulaCheck formulaCheck = new A3_FormulaCheck();
		formulaCheck.simpleInterest(200000,4.5,8.5);
		formulaCheck.temperatureConvert(102);
	}	
}