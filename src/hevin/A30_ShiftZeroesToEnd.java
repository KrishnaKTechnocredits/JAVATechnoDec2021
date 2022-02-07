package hevin;

import java.util.Arrays;

public class A30_ShiftZeroesToEnd {

	void moveZeroToEnd(int[] array) {
		
		int count = 0;
		int[] newarray = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				newarray[count] = array[i];
				count++;
			}
		}
		System.out.println("Output : " + Arrays.toString(newarray));
	}
	
	public static void main(String[] args) {
		A30_ShiftZeroesToEnd obj = new A30_ShiftZeroesToEnd();
		int[] array = { 1, 0, 1, 3, 4, 0, 6, 2, 5, 0 };
		obj.moveZeroToEnd(array);
	}
}
