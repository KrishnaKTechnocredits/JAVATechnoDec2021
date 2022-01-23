/*Assignment-25: 18th Jan'2022

Program 1 : Find the single missing number from the array.
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3 
*/

package deepak;

public class A25_MissingNumber {

	int getMissingNum(int[] input) {
		int sum = 0;
		int n = input.length + 1;
		int actualSum = (n * (n + 1)) / 2;
		for (int index = 0; index < input.length; index++) {
			sum += input[index];
		}
		int missingNum = actualSum - sum;
		return missingNum;
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		A25_MissingNumber missingNum = new A25_MissingNumber();
		System.out.print("The missing number in the given array is: ");
		System.out.println(missingNum.getMissingNum(input));
	}
}
