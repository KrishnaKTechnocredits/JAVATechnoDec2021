package anvit;

public class A15_Sum_Even_Positive_Array {
	
	int sumOfPositiveEvenNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= 0 && arr[index] % 2 == 0)
				sum = sum + arr[index];
			}
		return sum;
	}
	
	public static void main(String[] args) {
		A15_Sum_Even_Positive_Array a15_Sum_Even_Positive_Array = new A15_Sum_Even_Positive_Array();
		int[] arr = { 10, 13, -14, -20, 22, 3 };
		int sum = a15_Sum_Even_Positive_Array.sumOfPositiveEvenNum(arr);
		System.out.println("Sum of Positive Even number is : " + sum);
	}
}
