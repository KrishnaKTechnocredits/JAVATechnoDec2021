package anvit;

public class A15_Max_Number_Array {
	
	int maxNum(int[] arr) {
		int max = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (max < arr[index])
				max = arr[index];
		}

		return max;
	}
	
	public static void main(String[] args) {
		A15_Max_Number_Array a15_Max_Number_Array = new A15_Max_Number_Array();
		int[] arr = { 12, 93, 69, 298, 120, 8 };
		int max = a15_Max_Number_Array.maxNum(arr);
		System.out.println("Maximum number is "+ max);
	}
}
