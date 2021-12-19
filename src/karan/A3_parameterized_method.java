package karan;

public class Assignment_3 {
	/* 
	Assignment - 3 : 15th Dec2021

	Create two parameterized methods in same class. 

	Write a method to compute simple interest   
		Simple Interest = (P x T x R)/100 
		Where, 
			P is the principle amount 
			T is the time [year] and 
			R is the rate

	 Write a method to convert temperature from Fahrenheit to Celsius degree. 
		 Celsius = (fahrenheit - 32) * 5 / 9

	Call both methods from main method. write sop statement in each method to print output.

	*/
		
		void simpleInterest(double amount,double time,double rate){
			System.out.println("Simple interest :"+(amount*time*rate/100));
		}
		
		void fahrenheitCelsius(double fahrenheit){
			System.out.println("Fahrenheit to celsius is :" +(fahrenheit-32)*5/9);
		}
		
		public static void main(String[] args){
			Assignment_3 assignment3 = new Assignment_3();
			assignment3.simpleInterest(300,5,10);
			assignment3.fahrenheitCelsius(38);
		}
}
