package anjali;

public class A3_assigment3 {

	public static void main(String[] args) {
		A3_assigment3 assignmenrt3 = new A3_assigment3();
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
