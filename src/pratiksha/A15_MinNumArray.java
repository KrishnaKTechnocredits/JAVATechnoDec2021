package pratiksha;

public class A15_MinNumArray {

	int minNumArray(int[] arr) {
		int min = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (min > arr[index])
				min = arr[index];
		}

		return min;
	}

	public static void main(String[] args) {
		A15_MinNumArray minArray = new A15_MinNumArray();
		int[] arr = { 12, 32, 1, 65, 34 };
		int min = minArray.minNumArray(arr);
		System.out.println("Minimum number in the given array is : " + min);
	}
}
