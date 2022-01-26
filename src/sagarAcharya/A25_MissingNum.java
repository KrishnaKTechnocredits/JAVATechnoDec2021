package sagarAcharya;

public class A25_MissingNum {

	public static void main(String[] args) {
		A25_MissingNum a24 = new A25_MissingNum();
		int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		a24.singleMissing(num);
	}
	
	void singleMissing(int[] input) {
		int n = input.length + 1;
		int expSum = n*(n+1)/2;
		for(int i = 0;i<input.length;i++) {
			expSum -= input[i];
		}
		System.out.println("Missing Num is : "+expSum);
	}
}

/*
Assignment-25 : 18th Jan'2022

*Program 1 : Find the single missing number from the array.*
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3

*Try for multiple missing numbers in the same array*

*/