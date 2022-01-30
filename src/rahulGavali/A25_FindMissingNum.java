package rahulGavali;
/*Assignment-25: 18th Jan'2022
Program 1 : Find the single missing number from the array.
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3 
*/

public class A25_FindMissingNum {

	int getMissingNum(int[] arr) {
		int totalLength = arr.length + 1;
		// n*(n+1)/2
		int expectedSum = totalLength * (totalLength + 1) /2;
		for(int index=0; index<arr.length; index++) {
			expectedSum -= arr[index];
		}
		return expectedSum;
	}
	
	public static void main(String[] args) {
		A25_FindMissingNum findMissingNum = new A25_FindMissingNum();
		int[] input = {1, 2, 8, 10, 9, 5, 7, 6, 4};
		System.out.println("Missing number = " + findMissingNum.getMissingNum(input));
	}
}