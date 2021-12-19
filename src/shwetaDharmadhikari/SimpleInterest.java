package shwetaDharmadhikari;
class SimpleInterest{

	void calculateSimpleInterest(int p, int t, int r){
		int simpleInterest = (p*t*r)/100;
		System.out.println("Simple interest :" +simpleInterest);
	}
	
	void convertTemperature(double faherenhite){
		double celsius = (faherenhite - 32) * 5/9;
		System.out.println("Temperature :" +celsius);
	}
	
	public static void main(String[] args){
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.calculateSimpleInterest(5000,3,15);
		simpleInterest.convertTemperature(50);
	}	
}