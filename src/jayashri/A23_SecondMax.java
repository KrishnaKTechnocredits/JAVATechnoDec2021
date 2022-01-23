package jayashri;

public class A23_SecondMax {
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
		A23_SecondMax asec = new A23_SecondMax();
		int[] arr = { 1,11,3,99,66,54,22,44 };

		secmax = asec.secMaxNumber(arr);
		System.out.println("Second max no : " + secmax);
	}

}
