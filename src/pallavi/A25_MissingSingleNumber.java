/* Assignment-25 : 18th Jan'2022

Program 1 : Find the single missing number from the array.
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3
*/
package pallavi;

import java.util.Arrays;

public class A25_MissingSingleNumber {
	public static void main(String[] args) {
		int[] input= {1,2,4,5,7,8,10,9,6};
		System.out.println("Input :- "+Arrays.toString(input));
		new A25_MissingSingleNumber().findSingleMissingNumber(input);
	}

	 void findSingleMissingNumber(int[] input) {
		int totalNum=input.length+1;
		int expectedSum=totalNum*(totalNum+1)/2;
		
		for (int index=0;index<input.length;index++){
			expectedSum -=input[index];
		}
		System.out.println("Missing number:-"+expectedSum);
	}
}
