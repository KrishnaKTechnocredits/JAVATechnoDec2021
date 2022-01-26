package nehaPandey;

public class Assignment23_Program1 {

	void findSecondMaxFromGivenArray(int[] arr, int nthMax) {
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (arr[index] < arr[innerIndex])
					count++;
			}
			if (count == nthMax) {
				System.out.println("Second max from given array is :" + arr[index]);

				break;
			}

		}

	}

	public static void main(String[] args) {
		Assignment23_Program1 program1 = new Assignment23_Program1();
		int[] arr = { 1, 11, 3, 99, 66, 54, 22, 44 };
		program1.findSecondMaxFromGivenArray(arr, 1);
	}

}
