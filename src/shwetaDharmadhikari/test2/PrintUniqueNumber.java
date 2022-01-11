/* 1. How to find all pairs in an array of integers whose sum is equal to the given number
i/p  : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}

 * 2. WAP to print a single occurrence element from the array in Java?
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}
 */
package shwetaDharmadhikari.test2;

public class PrintUniqueNumber {

	void findUniqueNumber(int[] input) {
		for (int index = 0; index < input.length; index++) {
			int isUnique = 0;
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex])
					isUnique++;
			}
			if (isUnique == 1)
				System.out.print(input[index] + " ");
		}
	}

	void findPairs(int[] input, int sum) {
		for (int index = 0; index < input.length - 1; index++) {
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (sum == (input[index] + input[innerIndex])) {
					System.out.println("{ " + input[index] + "," + input[innerIndex] + "}");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 5, 8, 1, 2, 4, 3, 2, 1 };
		PrintUniqueNumber printUniqueNumber = new PrintUniqueNumber();
		System.out.println("Unique numbers in given array : ");
		printUniqueNumber.findUniqueNumber(input);
		System.out.println(" ");
		int arr[] = { 5, 1, 2, 7, 6, 3, 4, 9 };
		System.out.println("Pairs : ");
		printUniqueNumber.findPairs(arr, 6);
	}

}
