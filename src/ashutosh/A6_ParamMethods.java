package ashutosh;

class ParamMethods{

	void simpleInterest(double principal,double time,double rate){
		double simpleinterest = (principal*time*rate)/100;
		System.out.println("Simple interest is  " +  (long) simpleinterest);
	}

	void celsiusValue(float fahrenheit){
		float celsiusvalue = ((fahrenheit-32)*5)/9;
		System.out.println("Celsius value is  " +  (int) celsiusvalue);
	}
	
	public static void main(String [] Args){
		ParamMethods parammethods=new ParamMethods();
		parammethods.simpleInterest(10000.68, 2.5,3.9);
		parammethods.celsiusValue(35);
	}

}