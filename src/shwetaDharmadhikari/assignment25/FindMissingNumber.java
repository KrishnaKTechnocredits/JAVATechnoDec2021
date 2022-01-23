/*Assignment-25 : 18th Jan'2022

Program 1 : Find the single missing number from the array.
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3
 */
package shwetaDharmadhikari.assignment25;

import java.util.Arrays;

public class FindMissingNumber {
	
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
		// TODO Auto-generated method stub
		int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		System.out.println("Given array : " + Arrays.toString(num));
		new FindMissingNumber().findMissingNumber(num);
	}

}
