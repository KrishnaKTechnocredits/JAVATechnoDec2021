/*1. How to find all pairs in an array of integers whose sum is equal to the given number
i/p  : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}*/

package vrushali;

public class Exam2_AllPairsInAnArray {

	void sumOfTwoNumbersFromArray(int[] arr, int sum ) {
		for(int index = 0; index<arr.length; index++ ) {
			for(int j= index+1; j<arr.length; j++) {
				if(arr[index]+ arr[j]== sum)
					System.out.println("{" +arr[index] + "," + arr[j]+ "}");
			}
		}
	}

	public static void main(String[] args) {
		Exam2_AllPairsInAnArray allPairsInAnArray = new Exam2_AllPairsInAnArray();
		int[] arr = {5,1,2,7,6,3,4,9};
		allPairsInAnArray.sumOfTwoNumbersFromArray(arr, 6);
	}
}
