package swati.Swati_Test3;

import java.util.Arrays;

public class MaxInteger {
	int[] findMax(int num) {
		int rem = 0;
		int[] arr = new int[7];
		int i = 0;
		while (num > 0 && i <= 6) {
			rem = num % 10;
			arr[i] = rem;
			num = num / 10;
			i++;
		}
		return arr;
	}

	public static void main(String[] args) {
		int num = 6832774;
		MaxInteger m = new MaxInteger();
		int[] arr = m.findMax(num);
		Arrays.sort(arr);
		System.out.println("Max is " + arr[arr.length - 1]);

	}
}