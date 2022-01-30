package shamli;

/*
Program 1 : Find the single missing number from the array.*
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3
*/

public class Assignment25FindMissingNumberFromArray {

	public static void main(String[] args) {
		int num[]= { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		int n= num.length+1;
		int expectedSum=(n*(n+1)/2);
		
		for(int i=0;i<num.length;i++)
		{
			expectedSum=expectedSum-num[i];
		}
		System.out.println("The missing number from the array is : "+ expectedSum);
	}
}
