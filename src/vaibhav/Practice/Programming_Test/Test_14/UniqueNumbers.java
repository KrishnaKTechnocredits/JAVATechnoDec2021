/*26th May Coding Exam-14 : Collection

2. Return all the unique numbers from given array.
input : [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}*/

package vaibhav.Practice.Programming_Test.Test_14;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueNumbers {

	ArrayList<Integer> getUniqueNumbers(int words[]) {
		ArrayList<Integer> expectedOutputList = new ArrayList<Integer>();
		for (int num : words) {
			if (!expectedOutputList.contains(num)) {
				expectedOutputList.add(num);
			}
		}
		return expectedOutputList;
	}

	public static void main(String[] args) {
		int[] inputNum = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };

		UniqueNumbers uniqueNumbers = new UniqueNumbers();
		ArrayList<Integer> uniqueNums = uniqueNumbers.getUniqueNumbers(inputNum);

		System.out.println("Input Array		: " + Arrays.toString(inputNum));
		System.out.println("Expected Output Array	: " + uniqueNums);
	}
}
