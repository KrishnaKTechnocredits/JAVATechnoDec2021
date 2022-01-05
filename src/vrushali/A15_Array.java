package vrushali;

public class A15_Array {

	int getMaxNumber(int[] arr) {

		int maxNum = arr[0];
		for(int index = 1; index< arr.length; index++) {
			if(maxNum<arr[index])
				maxNum = arr[index];
		}
		return maxNum;
	}
	
	int getMinNumber(int[] arr) {
		int minNum = arr[0];
		for(int index = 1; index< arr.length; index++) {
			if (minNum>arr[index])
			minNum = arr[index];
		}
		return minNum;
	}
	
	int getCountOfPositiveNum(int[] arr) {
		
		
		return 0;
	}

	public static void main(String[] args) {
		A15_Array array15 = new A15_Array();
		int[] maxNumberArray = {5, 99, 2, 19, 89, 100};
		System.out.println("Maximum number in given array is " + array15.getMaxNumber(maxNumberArray));
		
		int[] minNumArray = {4,67,2, 40, -10, 1};
		System.out.println("Minimum Number in given array is " + array15.getMinNumber(minNumArray));
		
		 int[] arr = {12,-11,99,11,23,-44};
		 System.out.println("Count of positive numbers from given array is " + array15.getCountOfPositiveNum(arr));
	}
}
