package nehaPatil;
class Parameterized{
     
	void computeSimpleInterest(int P,int T,int R){
	    double simpleInterest = (P * T * R)/100;
	    System.out.println("The Simple Interest is " + simpleInterest);
	}
	
    void convertTemperature(float fahrenheit){
	    float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("The conversion of temp from fahrenheit to celsius "+ celsius);
	}
	
	public static void main(String[] args){
	    Parameterized parameterized = new Parameterized();
		parameterized.computeSimpleInterest(3000,3,33);
		parameterized.convertTemperature(130);
	}
}