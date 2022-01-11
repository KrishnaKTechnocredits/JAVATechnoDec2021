package sandip;

public class Test_2 {

	void singleOccurance(int[] s2) {
		for (int index = 0; index < s2.length; index++) {
			int count = 0;
			int n1 = s2[index];
			for (int index1 = 0; index1 < s2.length; index1++) {
				if (n1 == s2[index1]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(n1 + " ");
			}
		}
	}

	void pairOfArray(int[] s2) {
		System.out.println();
		System.out.println();
		for (int index = 0; index < s2.length; index++) {
			int n1 = s2[index];
			for (int index1 = index + 1; index1 < s2.length; index1++) {
				if ((n1 + s2[index1]) == 6) {
					System.out.print(n1 + " ");
					System.out.print(s2[index1] + "  ");
				}
			}

		}
	}

	public static void main(String[] args) {
		Test_2 a1 = new Test_2();
		int[] s1 = { 5, 8, 1, 2, 4, 3, 2, 1 };
		a1.singleOccurance(s1);
		int[] s2 = { 5, 1, 2, 7, 6, 3, 4, 9 };
		a1.pairOfArray(s2);
	}
}
