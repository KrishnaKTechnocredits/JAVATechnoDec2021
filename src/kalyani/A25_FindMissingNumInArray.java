package kalyani;

import java.util.Arrays;

public class A25_FindMissingNumInArray {
	
	int missingNumInArray(int[] num) {
		int n = num.length + 1;
		int sum = (n * (n + 1) / 2);
		for (int index = 0; index < num.length; index++) {
			sum = sum - num[index];
		}
		System.out.println("missing number from given array is = " + sum);
		return sum;
	}

	public static void main(String[] a) {
		A25_FindMissingNumInArray assign25 = new A25_FindMissingNumInArray();
		int num[] = { 1, 2, 5, 10, 9, 8, 7, 6, 4 };
		System.out.println("Given array is : " + Arrays.toString(num));
		assign25.missingNumInArray(num);
	}
}


