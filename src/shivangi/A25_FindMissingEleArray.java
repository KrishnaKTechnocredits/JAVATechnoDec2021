/*
Assignment-25 : Find the single missing number from the array.
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3
*/

package shivangi;

public class A25_FindMissingEleArray {
	
	void findMissingEleFromArray() {
		int[] arr = {1, 2, 8, 10, 9, 5, 7, 6, 4};
		int n = arr.length+1;
		int expSum = (n*(n+1)/2);
		//System.out.println(expSum);
		for(int index=0; index<=arr.length-1; index++) {
			expSum = expSum - arr[index];
		}
		System.out.println("Missing number between 1 to to 10 is : " + expSum);
	}
	
	public static void main(String[] args) {
		A25_FindMissingEleArray a5 = new A25_FindMissingEleArray();
		a5.findMissingEleFromArray();
	}
}
