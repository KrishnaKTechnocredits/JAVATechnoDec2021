package kavleen;

import java.util.Arrays;
public class Assignment25 {
	
	int missingNumInArray(int[] num) {
		int n = num.length + 1;
		int sum = (n * (n + 1) / 2);
		for (int index = 0; index < num.length; index++) {
			sum = sum - num[index];
		}
		System.out.println("missing number from given array is = " + sum);
		return sum;
	}
	public static void main (String [] args) {
		Assignment25 assignment25 = new Assignment25();
		int [] num = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		System.out.println("Array is " + Arrays.toString(num));
		assignment25.missingNumInArray(num);
	}
}
