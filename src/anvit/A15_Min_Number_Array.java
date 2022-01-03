package anvit;

public class A15_Min_Number_Array {
	
	int minNum(int[] arr) {
		int min = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (min > arr[index])
				min = arr[index];
		}

		return min;
	}
	
	public static void main(String[] args) {
		A15_Min_Number_Array a15_Min_Number_Array = new A15_Min_Number_Array();
		int[] arr = { 12, 93, 69, 298, 120, 8 };
		int min = a15_Min_Number_Array.minNum(arr);
		System.out.println("Minimum number is "+ min);
	}
}
