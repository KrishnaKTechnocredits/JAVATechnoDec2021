package shamli;


public class Assignment17Program1 {

	void findTripletsInGivenArray(int[] arr) {
		for (int index = 0; index < arr.length - 2; index++) {
			int nextValue = arr[index + 1];
			int nextToNextValue = arr[index + 2];
			if (nextValue == arr[index] + 1 && nextToNextValue == nextValue + 1)
				System.out.println(arr[index] + " --> " + nextValue + " --> " + nextToNextValue);
		}
	}

	public static void main(String[] args) {
		Assignment17Program1 assignment17prog1 = new Assignment17Program1();
		int[] arr = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		assignment17prog1.findTripletsInGivenArray(arr);
	}
}
