/*Programming Test - 12 : 22nd May'2021

1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15
*/

package vaibhav.Practice.Programming_Test.Test_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumOperations {

	ArrayList<Integer> filerNumber(ArrayList<Integer> arr) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (Integer num : arr) {
			if (num % 3 == 0 || num % 5 == 0) {
				outputList.add(num);
			} else if (num % 3 == 0 && num % 5 == 0) {
				outputList.add(num);
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		NumOperations numOperations = new NumOperations();
		Integer [] inputArr = {10,2,3,6,15,44,32};
		List <Integer> intList = Arrays.asList(inputArr);
		ArrayList<Integer> inputList = new ArrayList<Integer>(intList);		
		ArrayList<Integer> expectedOutput = numOperations.filerNumber(inputList);
		
		System.out.println("Input List : " + inputList);
		System.out.println("Expected output List : "+ expectedOutput);		
	}
}
