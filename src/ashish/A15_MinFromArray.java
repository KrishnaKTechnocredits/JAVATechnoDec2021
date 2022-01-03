package ashish;

public class A15_MinFromArray {
	
	int minNumberFromArray(int arr[]) {
		int minNumber = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] < minNumber)
				minNumber = arr[i];
		}
		return minNumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A15_MinFromArray minFromArray = new A15_MinFromArray();
		int arr[] = {10, 8, 15, 20, 4, 17};
		System.out.println(" Min number from array {10, 8, 15, 20, 4, 17} is : " + minFromArray.minNumberFromArray(arr));
	}
}
