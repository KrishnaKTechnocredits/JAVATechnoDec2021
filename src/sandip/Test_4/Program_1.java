package sandip.Test_4;

import java.util.Arrays;

public class Program_1 {

	boolean arraySquare(int[] a) {
		boolean flag = false;
		for (int index = 0; index < a.length - 1; index++) {
			if (a[index + 1] == a[index] * a[index]) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Program_1 p1 = new Program_1();
		int[] arr = { 2, 4, 16, 256 };
		String s1 = Arrays.toString(arr);
		System.out.println(s1);
		System.out.println("The given array have squares :" + p1.arraySquare(arr));
	}
}
