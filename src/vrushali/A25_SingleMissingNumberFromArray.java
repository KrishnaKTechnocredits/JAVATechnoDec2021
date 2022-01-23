//Program 1 : Find the single missing number from the array.
//int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
//output: 3

package vrushali;

public class A25_SingleMissingNumberFromArray {
	void findMissingNumber(int[] num) {	
		int actualSum =0;
		int n = num.length + 1;
		int expSum = (n*(n+1)/2);

		for(int index = 0; index < num.length; index++) {
			actualSum = actualSum +  num[index];
		}
		int missingNum = expSum - actualSum;
		System.out.println("Missing number from array: " + missingNum);
	}

	public static void main(String[] args) {
		A25_SingleMissingNumberFromArray singleMissingNumberFromArray =  new A25_SingleMissingNumberFromArray();
		int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		singleMissingNumberFromArray.findMissingNumber(num);
	}
}
