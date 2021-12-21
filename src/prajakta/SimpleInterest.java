package prajakta;

class SimpleInterest{
	
	void calculateInterest(double p, double t, double r){
		double ans = p * t * r / 100 ;
		System.out.println("Simple interest is " + ans);
	}

	void convertTemp(double farenheit){
		double ans = (farenheit - 32) * 5/9;
        System.out.println("Farenheit to calcius is " + ans);
    }
	
	public static void main(String[] args){
		SimpleInterest simpleinterest = new SimpleInterest();
		simpleinterest.calculateInterest(1500,10,20);
		simpleinterest.convertTemp(56);
	}	
}