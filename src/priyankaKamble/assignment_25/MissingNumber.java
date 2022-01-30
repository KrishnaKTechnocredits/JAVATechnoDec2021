package priyankaKamble.assignment_25;

import java.util.Arrays;

/*Assignment-25 : 18th Jan'2022

Program 1 : Find the single missing number from the array.
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3*/
public class MissingNumber {
		
	int findMissingNum(int[] num) {
		Arrays.sort(num); 
		int missingNumber=0;int missingIndex=0;
		//System.out.println("Check "+Arrays.toString(num));
		for(int index =0; index < num.length; index++) {
			if(num[index] != index+1) {
				missingNumber = index+1;
				missingIndex = index;
				break;
			}
		}
		System.out.println("Missing number is present at index => "+missingIndex);
		return missingNumber;
	}
	
	public static void main(String[] args) {
		MissingNumber missingNumber = new MissingNumber();
		int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		System.out.println("Input Array = " +Arrays.toString(num)+"\n");
		System.out.println("Missing Number is = > " +missingNumber.findMissingNum(num) );
		
	}
}
