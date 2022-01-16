package vaishnavi;

public class A23_ArrayExamples {
	int findSecondMaxFromArray(int[] arr, int num) {
		if (arr.length >= num) {
			int maxNum = 0;
			for (int index = 0; index < arr.length; index++) {
				int count = 0;
				for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
					if (arr[index] > arr[innerIndex])
						count++;
				}
				if (count == arr.length - num)
					maxNum = arr[index];
			}
			return maxNum;
		} else
			System.out.println(num + "is a minimum number from given array");
		return 0;
	}

	public static void main(String[] args) {
		A23_ArrayExamples a23_ArrayExamples = new A23_ArrayExamples();
		int[] arr = { 1, 11, 3, 99, 66, 54, 22, 44 };
		System.out.println("Second max number is: "+a23_ArrayExamples.findSecondMaxFromArray(arr, 2));
	}
}

