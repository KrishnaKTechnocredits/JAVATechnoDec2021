package ashish;

public class A15_SumOfEvenPositiveFromArray {
	
	int sumOfEvenPositiveFromArray(int arr[]) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			if((arr[i] > 0) && (arr[i] % 2 == 0))
				sum = sum + arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A15_SumOfEvenPositiveFromArray sumOfPositiveFromArray = new A15_SumOfEvenPositiveFromArray();
		int arr[] = {10, 8, -15, -20, 4, 17};
		System.out.println(" Sum of Even Positive numbers from array {10, 8, -15, -20, 4, 17} is : " + sumOfPositiveFromArray.sumOfEvenPositiveFromArray(arr));
	}
}
