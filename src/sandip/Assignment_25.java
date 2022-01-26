package sandip;

public class Assignment_25 {

	void missingDigit(int[] i1) {
		int temp = 0;
		int n = i1.length + 1;
		int exp = ((n * (n + 1)) / 2);
		for (int index = 0; index < i1.length; index++) {
			temp = temp + i1[index];
		}
		exp = exp - temp;
		System.out.println("missing digit is :" + exp);
	}

	public static void main(String[] args) {
		Assignment_25 n1 = new Assignment_25();
		int[] arr = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		n1.missingDigit(arr);
	}
}
