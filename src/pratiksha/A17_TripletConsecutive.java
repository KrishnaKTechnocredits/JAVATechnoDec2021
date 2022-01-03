package pratiksha;

public class A17_TripletConsecutive {

	void findTripletsInArray(int[] arr) {
		for (int index = 0; index < arr.length - 2; index++) {
			int nextValue = arr[index + 1];
			int nextToNextValue = arr[index + 2];
			if (nextValue == arr[index] + 1 && nextToNextValue == nextValue + 1)
				System.out.println(arr[index] + " --> " + nextValue + " --> " + nextToNextValue);
		}
	}

	public static void main(String[] args) {
		A17_TripletConsecutive consecutive = new A17_TripletConsecutive();
		int[] arr = { 21, 13, 14, 15, 16, 19, 20, 22, 23, 25 };
		consecutive.findTripletsInArray(arr);

	}

}
