package yogeshNagar;

public class A17_ConsecutiveTripletArray {

	void getConsecutiveTriplet(int[] arr) {

		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index + 1] == arr[index] + 1 && arr[index + 2] == arr[index] + 2) {
				System.out.println(arr[index] + " -> " + arr[index + 1] + " -> " + arr[index + 2]);
			}
		}
	}

	public static void main(String[] args) {
		A17_ConsecutiveTripletArray consecutiveArr = new A17_ConsecutiveTripletArray();
		int[] arr = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		consecutiveArr.getConsecutiveTriplet(arr);

	}

}
