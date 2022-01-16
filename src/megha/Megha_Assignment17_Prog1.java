package megha;

public class Megha_Assignment17_Prog1 {

	void findTripletsInGivenArray(int[] arr) {
		for (int index = 0; index < arr.length - 2; index++) {
			int nextValue = arr[index + 1];
			int nextToNextValue = arr[index + 2];
			if (nextValue == arr[index] + 1 && nextToNextValue == nextValue + 1)
				System.out.println(arr[index] + " --> " + nextValue + " --> " + nextToNextValue);
		}
	}

	public static void main(String[] args) {
		Megha_Assignment17_Prog1 megha_Assignment17 = new Megha_Assignment17_Prog1();
		int[] arr = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		megha_Assignment17.findTripletsInGivenArray(arr);

	}

}
