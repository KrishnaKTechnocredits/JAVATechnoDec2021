/*
WAP to find out the total sum of all the numbers present in the given string without using Character class method.
Input    : I have 15 years and 3 months of automation experience
Output : Expected Sum  = 18
 */
package monikaArkade;

public class A29_SumOfDigitsFromString {
	void sumOfNumFromString(String input) {
		String[] str = input.split(" ");
		int sum = 0;
		for (int index = 0; index < str.length; index++) {
			try {
				sum = sum + Integer.parseInt(str[index]);
			} catch (Exception e) {
			}
		}
		System.out.println("Sum of all numbers present in string is: " + sum);
	}

	public static void main(String[] args) {
		A29_SumOfDigitsFromString sum = new A29_SumOfDigitsFromString();
		String input = "I have 15 years and 3 months of automation experience";
		sum.sumOfNumFromString(input);
	}
}
