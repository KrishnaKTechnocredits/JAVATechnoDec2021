package pratiksha;

public class A15_MaxNumArray {

	int maxNumberFromGivenArray(int[] arr) {
		int max = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (max < arr[index])
				max = arr[index];
		}

		return max;
	}

	public static void main(String[] args) {
		A15_MaxNumArray  maxNumArray = new A15_MaxNumArray ();
		int[] arr = { 20, 45, 76, 127, 12 };
		int max = maxNumArray.maxNumberFromGivenArray(arr);
		System.out.println("Maximum number in the given array is : " + max);

	}
}
