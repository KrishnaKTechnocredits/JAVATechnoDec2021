package gauravk.Assignment03;

import java.util.Scanner;

/*
 * Assignment - 3 : 15th Dec2021

Create two parameterized methods in the same class. 
Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9

Call both methods from the main method. write sop statements in each method to print output.
please use proper variable name instead of P, T , R

 */
public class TemperatureConversion {
	
	double conversionFToC(double fahrenheit) {
		return (fahrenheit-32)*5/9;
	}
	
	double conversionCToF(double celcius) {
		return (celcius*9/5)+32;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TemperatureConversion tc = new TemperatureConversion();
		System.out.println("Temperature conversion from Celcius or Fahrenheit?\n Type C or F");
		char input = Character.toUpperCase(sc.next().charAt(0));
		double result=0;
		switch(input) {
		case 'C':
			System.out.println("Enter temperature in Celcius to find out its Fahrenheit value.");
			result = tc.conversionCToF(sc.nextDouble());
			System.out.println("Result: "+result);
			break;
		case 'F':
			System.out.println("Enter temperature in Fahrenheit to find out its Celcius value.");
			result = tc.conversionFToC(sc.nextDouble());
			System.out.println("Result: "+result);
			break;
		default:
			System.out.println("Wrong input. Either C or F.");
		}
	}
}
