package rohini;

import java.util.Arrays;


/*Assignment-25 : 18th Jan'2022

*Program 1 : Find the single missing number from the array.*
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3

*Try for multiple missing numbers in the same array*
*/


public class Rohini_Assignment25 {
	
	int findMissingNumber(int arr[]) {
		int n = arr.length + 1;
		int num = (n * (n + 1) / 2);
		for (int index = 0; index < arr.length; index++) {
			num = num - arr[index];
		}
		System.out.println("Missing number from given array is = " + num);
		return num;
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		System.out.println("Given array : " + Arrays.toString(num));
		new Rohini_Assignment25().findMissingNumber(num);
	}

}