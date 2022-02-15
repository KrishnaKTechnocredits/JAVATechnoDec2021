/*
Test6-Program3. sum of all numbers in a given statement.
input = "10 10 20 30";
output : 70
*/
package shivangi.exam.exam6;

import java.util.Arrays;

public class Test6_P3 {
	
	int getSumOfAllNumFromGivenString(String input) {
		String[] numArr = input.split(" ");
		System.out.println("Given input is : " + Arrays.toString(numArr));
		int sum = 0;
		for(int index=0; index<numArr.length; index++) {
			sum = sum + Integer.parseInt(numArr[index]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Test6_P3 p3 = new Test6_P3();
		int output = p3.getSumOfAllNumFromGivenString("10 10 20 30");
		System.out.println("Sum of given input is : " + output);
	}
}
