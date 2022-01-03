package anvit;

public class A15_Sum_Positive_Array {
	
	int sumOfPositiveNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= 0)
				sum = sum + arr[index];;
		}

		return sum;
	}
	
	public static void main(String[] args) {
		A15_Sum_Positive_Array a15_Sum_Positive_Array = new A15_Sum_Positive_Array();
		int[] arr = { 10, 20, -33, -55, 2};
		int sum = a15_Sum_Positive_Array.sumOfPositiveNum(arr);
		System.out.println("Sum of positive number is : " + sum);
	}
}
