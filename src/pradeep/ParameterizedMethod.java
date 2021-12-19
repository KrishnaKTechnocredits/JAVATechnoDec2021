package pradeep;

class ParameterizedMethod{
	void simpleInterest(int p, float t, float r){
		float sI = (p * r * t)/100;
		System.out.println("Simple Interest is " + sI);
	}
	
	void faherenToCelcius(float fahren){
		float celcius = (fahren - 32) * (5f/9);
		System.out.println("Celcius value is " + celcius);		
	}
	
	public static void main(String[] args){
		ParameterizedMethod parameterizedMethod = new ParameterizedMethod();
		parameterizedMethod.simpleInterest(16000,2,5);
		parameterizedMethod.simpleInterest(16000,2.5f,5);
		parameterizedMethod.faherenToCelcius(300);
		parameterizedMethod.faherenToCelcius(300.50f);
	}
}