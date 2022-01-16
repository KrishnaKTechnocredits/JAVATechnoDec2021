package technocredits;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] arr = {13,25,10,23,1,11,19};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-1]);
	}
}
