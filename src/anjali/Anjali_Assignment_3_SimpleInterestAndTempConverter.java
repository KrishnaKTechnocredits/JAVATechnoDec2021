package anjali;

public class Anjali_Assignment_3_SimpleInterestAndTempConverter {

	public static void main(String[] args) {
		Anjali_Assignment_3_SimpleInterestAndTempConverter assignmenrt3 = new Anjali_Assignment_3_SimpleInterestAndTempConverter();
		assignmenrt3.simpleIntersest(3000,9,10);
		assignmenrt3.converter(39.5);


	}
	void simpleIntersest(int principle,int year,int rate){
		double SimpleInterest = (principle * year * rate)/100; 
		System.out.println("The simple Intersest is "+ SimpleInterest);
	}
	
	void converter(double fahrenheit ){
		double Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("The coverted temp in Celsius is  "+ Celsius);
	}

}
