package poojaRajguru;

class A2_DataType{
	
	void simpleInterest(double pamt,double year,double rate){
		double simpleInterest = (pamt * year * rate)/100;
		System.out.println("The Simple Interest is = " + simpleInterest);	
	}
	
	void fahtToCelsius(double fah){
		double celsius = (fah - 32) * 5 / 9;
		System.out.println("The Temperature is = " + celsius);	
	}
	
	public static void main(String[] args){
		A2_DataType dataType = new A2_DataType();
		dataType.simpleInterest(1000,5,3);
		dataType.fahtToCelsius(30);
	}
}