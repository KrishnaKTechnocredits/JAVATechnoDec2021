package anvit;

public class A15_Count_Positive_Array {
	
	int countOfPositiveNumber(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= 0)
				count++;
		}

		return count;
	}
	
	public static void main(String[] args) {
		A15_Count_Positive_Array a15_Count_Positive_Array = new A15_Count_Positive_Array();
		int[] arr = { 12, -11, 99, 11,  23, -44};
		int count = a15_Count_Positive_Array.countOfPositiveNumber(arr);
		System.out.println("Count of positive number is : " + count);
	}
}
