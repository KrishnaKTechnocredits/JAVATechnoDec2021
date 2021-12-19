package vaishnavi;

class SimpleInterest{
	
	void calculateInterest(int p, int t, float r){
		double si =(p*t*r)/100;
		System.out.println("Simple Interest is "+si);
	}
	
	void convertTemp(float fahrenheit){
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println(" Temperature is "+celsius);
	}
	
	public static void main(String[] args){
		SimpleInterest simpleinterest= new SimpleInterest();
		simpleinterest.calculateInterest(1500,10,20);
		simpleinterest.convertTemp(56);
	}
}