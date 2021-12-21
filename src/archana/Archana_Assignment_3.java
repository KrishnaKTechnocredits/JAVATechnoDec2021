package archana;
class Archana_Assignment_3{
	
	void simpleInterest(double principle, double time, double rate){
		
		double simpleInterest =  (principle * time * rate) / 100 ; 
		System.out.println("Simple Interest is : " + simpleInterest);
		
    }
	void Tempreture(double fahrenheit){
		
		double tempCelsius =  (fahrenheit - 32) * 5 / 9 ; 
		System.out.println("Tempreture in Celsius  : " + tempCelsius);
		
    }
	public static void main(String[] args){
		
		Archana_Assignment_3 ass3 = new Archana_Assignment_3();
		ass3.simpleInterest(1200000 , 24 , 10);
		ass3.Tempreture(40);
		
	}
	
}