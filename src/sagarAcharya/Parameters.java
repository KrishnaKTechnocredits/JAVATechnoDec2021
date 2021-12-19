package sagarAcharya;

class Parameters{

	void simpleInt(double p,double t,double r){
		double ans = p * t * r / 100 ; 
		System.out.println("Simple interest is " + ans);
	}
	
	void convert(double fer){
		double ans = (fer - 32) * 5/9;
		System.out.println("Celcius is " + ans);
	}
	public static void main(String[] args){
		Parameters parameters = new Parameters();
		parameters.simpleInt(15000,2.5,13.8);
		parameters.convert(10);
	}
}