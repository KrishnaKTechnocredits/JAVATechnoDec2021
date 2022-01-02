package abhishek;
class Assignment15 {
	int maxNumber(int[] arr) {
		int max = arr[0];
		for(int index = 1; index < arr.length; index++) {
			if(max < arr[index])
				max = arr[index];
		}
		
		return max;
	}
	
	int minNumber(int[] arr) {
		int min = arr[0];
		for(int index = 1; index < arr.length; index++) {
			if(min > arr[index])
				min = arr[index];
		}
		
		return min;
	}
	
	int countPositiveNumber(int[] arr) {
		int count = 0;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] > 0 )
				count++;
		}
		
		return count;
	}
		int sumPositiveNumber(int[] arr) {
		int sum = 0;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] > 0)
			sum = sum + arr[index];
		}
		return sum ;
	}
	
	int sumOfEvenPostiveNum(int[] arr) {
		int sum = 0;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] > 0 && arr[index] % 2 == 0)
				sum = sum + arr[index];
		}
		return sum ;
	}
	
	String maxLengthString(String[] arr) {
		String maxString = arr[0];
		int maxLength = arr[0].length();
		for (int index = 1; index < arr.length; index++) {
			if (maxLength < arr[index].length()) {
				maxString = arr[index];
				maxLength = arr[index].length();
			}
		}
		
		return maxString;
	}
	
	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		int[] a = {75, 86, -29, 45, 99, -5, 80, 101};
		System.out.println("Max Number in array is: " + assignment15.maxNumber(a));
		System.out.println("Min Number in array is: " + assignment15.minNumber(a));
		
		int[] arr = { 12, -11, 99, 11, 23, -44 };
		System.out.println("Count of all positive Number in array is: " + assignment15.countPositiveNumber(arr));
		
		int[] arr1 = { 10, 20, -33, -55, 2 };
		System.out.println("Sum of all Positive Number is: " + assignment15.sumPositiveNumber(arr1));
		
		int[] arr2 = { 10, 13, -14, -20, 22, 3 };
		System.out.println("Sum of all Positive Even Number is: " + assignment15.sumOfEvenPostiveNum(arr2));
		
		String[] str = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		System.out.println("String with max length is: " + assignment15.maxLengthString(str));
	}
}
		
		
		