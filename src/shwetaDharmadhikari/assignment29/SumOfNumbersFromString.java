/* Assignment 29 : 25th Jan'2022

WAP to find out the total sum of all the numbers present in the given string without using Character class method.
Input    : I have 15 years and 3 months of automation experience
Output : Expected Sum  = 8

Hint: Using exception handling (i.e. try catch block). 
 */
package shwetaDharmadhikari.assignment29;

public class SumOfNumbersFromString {
	void SumOfNumbersUsingException(String input) {
		String[] str = input.split(" ");
		int sum = 0;
		for (int index = 0; index < str.length; index++) {
			try {
				sum = sum + Integer.parseInt(str[index]);
			} catch (NumberFormatException e) {

			}
		}
		System.out.println("Sum = " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I have 15 years and 3 months of automation experience";
		new SumOfNumbersFromString().SumOfNumbersUsingException(input);
	}

}
