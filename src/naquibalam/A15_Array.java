package naquibalam;

public class A15_Array {
	
	int getMaxNumber() {
		int[] arr = {10,20,117,118,197,123,1,25};
		int maxValue = arr[0];
		for (int i=1; i<arr.length;i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	
	int getMinNumber() {
		int[] arr = {10,20,117,118,197,123,1};
		int minValue = arr[0];
		for (int i=1; i<arr.length;i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}
	
	int getPositiveCount() {
		int[] arr = {12,-11,99,11,23,-44};
		int count = 0;
		for (int i=0; i<arr.length;i++) {
			if (arr[i] > 0) {
				count++;
			}
		}
		return count;
	}
	
	int getPositiveSum() {
		int[] arr = {10,20,-33,-55,2};
		int sum = 0;
		for (int i=0; i<arr.length;i++) {
			if (arr[i] > 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}
	
	int getPositiveSumEven() {
		int[] arr = {10,13, -14, -20, 22, 3};
		int sum = 0;
		for (int i=0; i<arr.length;i++) {
			if ((arr[i] > 0) && (arr[i] % 2 == 0)) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}
	
	String getMaxLength() {
		String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		int eachLength = 0;
		int maxLength = arr[0].length();
		int MaxLenFoundOnIndex = 0;
		for (int i=1; i<arr.length;i++) {
			eachLength = arr[i].length();
			if (eachLength > maxLength) {
				maxLength = eachLength;
				MaxLenFoundOnIndex = i;
			}
		}
		return arr[MaxLenFoundOnIndex];
	}
	
	public static void main(String[] args) {
		A15_Array a15_Array = new A15_Array();
		System.out.println("Max Value from the array is - " + a15_Array.getMaxNumber());
		System.out.println("Min Value from the array is - " + a15_Array.getMinNumber());
		System.out.println("Count of positive values in array is - " + a15_Array.getPositiveCount());
		System.out.println("Sum of positive numbers in the array is - " + a15_Array.getPositiveSum());
		System.out.println("Sum of positive even numbers in the array is - " + a15_Array.getPositiveSumEven());
		System.out.println("Name having maximum length is - " + a15_Array.getMaxLength());
	}
}
