/*Assignment 29 : 25th Jan'2022

WAP to find out the total sum of all the numbers present in the given string without using Character class method.
Input    : I have 15 years and 3 months of automation experience
Output : Expected Sum  = 8

Hint      : Using exception handling (i.e. try catch block). 

*/

package vaibhav.Assignment_29;

public class TotalSum {
	void getExpectedSum(String str) {
		String[] inputArr = str.split(" ");
		int sum = 0;
		for (int index = 0; index < inputArr.length; index++) {
			try {
				sum = sum + Integer.parseInt(inputArr[index]);
			} catch (NumberFormatException ne) {
			}
		}
		System.out.println("Expected Sum = " + sum);
	}

	public static void main(String[] args) {
		TotalSum totalSum = new TotalSum();
		String inputString = "I have 15 years and 3 months of automation experience";
		System.out.println("Input String : " + inputString);
		totalSum.getExpectedSum(inputString);
	}
}
