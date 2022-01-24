package nishika;

public class A_28 {

	int trees(int[] input) {

		int max = 0;
		int count = 0;

		for (int index = 0; index < input.length; index++) {
			if (max < input[index]) {
				max = input[index];
				// System.out.println(max);
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		A_28 tress = new A_28();
		int[] arr = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		int ans = tress.trees(arr);
		System.out.println(ans + "  --->  Trees are visible");
	}
}
