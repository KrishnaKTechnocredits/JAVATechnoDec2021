package sandip;

public class Assignment_28 {

	void visibleTree(int[] a1) {
		int first = a1[0];
		int count = 1;
		for (int index = 1; index < a1.length; index++) {
			if (first < a1[index]) {
				first = a1[index];
				count++;
			}
		}
		System.out.println("Number of trees visible :" + count);
	}

	public static void main(String[] args) {
		Assignment_28 a1 = new Assignment_28();
		int[] arr = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		a1.visibleTree(arr);
	}
}
