package archana;

public class Ass23_P1_SecMaxInArray {

	int secMaxNumber(int[] arr) {
		int maxNo = 0;
		int secondMax = 0;
		if (arr[0] > arr[1]) {
			maxNo = arr[0];
			secondMax = arr[1];
		} else {
			maxNo = arr[1];
			secondMax = arr[0];
		}
		for (int i = 2; i < arr.length; i++) {
			if (maxNo < arr[i]) {
				secondMax = maxNo;
				maxNo = arr[i];
			} else if (maxNo > arr[i] && secondMax < arr[i]) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

	public final static void main(String[] args) {

		int secmax = 0;
		Ass23_P1_SecMaxInArray ass23 = new Ass23_P1_SecMaxInArray();
		int[] arr = { 10, 4, 99, 56, 8, 15 };

		secmax = ass23.secMaxNumber(arr);
		System.out.println("Second max no : " + secmax);
	}
}
