package anvit;

import java.util.Arrays;

public class A30_Shift_All_Zero_Elements {
	
	void shiftZeroElements(int[] input) {
		int[] arr = new int[input.length];
		int temp = 0;
		for(int i =0; i<input.length;i++) {
			if(input[i]>0) {
				arr[temp] = input[i]; 
				temp++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		A30_Shift_All_Zero_Elements a30 = new A30_Shift_All_Zero_Elements();
		int[] input = {1, 0, 2, 0, 9, 6, 0, 19, 20, 0};
		a30.shiftZeroElements(input);
	}
}
