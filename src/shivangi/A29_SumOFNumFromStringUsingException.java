/*
Assignment-29 : 25th Jan'2022
WAP to find out the total sum of all the numbers present in the given string without using Character class method.
Input  : I have 15 years and 3 months of automation experience
Output : Expected Sum  = 8

Hint   : Using exception handling (i.e. try catch block). 
*/

package shivangi;

public class A29_SumOFNumFromStringUsingException {
	
	void SumOFNumFromStringUsingException(String input) {
		System.out.println("Given input string : " + input);
		String[] stringArr = input.split(" ");
		int sum = 0;
		for(int index=0; index<=input.length()-1; index++) {
			try {
				sum = sum + Integer.parseInt(stringArr[index]);
			} catch(Exception e) {
				//System.out.println("In catch");
			}
		}
		System.out.println("Total Sum from given input is :" + sum);
	}
	
	public static void main(String args[]) {
		A29_SumOFNumFromStringUsingException a29 = new A29_SumOFNumFromStringUsingException();
		a29.SumOFNumFromStringUsingException("I have 15 years and 3 months of automation experience");
	}
	
}
