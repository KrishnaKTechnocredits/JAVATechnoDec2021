/*Assignment 29 : 25th Jan'2022

WAP to find out the total sum of all the numbers present in the given string without using Character class method.
Input    : I have 15 years and 3 months of automation experience
Output : Expected Sum  = 8

Hint      : Using exception handling (i.e. try catch block). 
*/

package pallavi;

public class A29_SumOfNumwithException {

	int getSumOfNum(String input) {
		int sum = 0;
		String[] temp = input.split(" ");

		for (String str : temp) {
			try {
				sum += Integer.parseInt(str);
			} catch (NumberFormatException ne) {
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String input = "I have 15 years and 3 months of automation experience";
		System.out.println("Input String: " + input);
		System.out.println("Sum of numbers in strin: " + new A29_SumOfNumwithException().getSumOfNum(input));
	}
}
