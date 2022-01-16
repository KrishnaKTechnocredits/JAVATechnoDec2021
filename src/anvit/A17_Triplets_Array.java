package anvit;

public class A17_Triplets_Array {

	void findTriplets(int[] arr) {
		for (int index = 0; index < arr.length - 2; index++) {
			int value = arr[index + 1];
			int nextValue = arr[index + 2];
			if (value == arr[index] + 1 && nextValue == arr[index] + 2)
				System.out.println(arr[index] + " --> " + value + " --> " + nextValue);
		}
	}
	
	public static void main(String[] args) {
		A17_Triplets_Array a17_Triplets_Array = new A17_Triplets_Array();
		int[] arr = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		a17_Triplets_Array.findTriplets(arr);
	}
}
