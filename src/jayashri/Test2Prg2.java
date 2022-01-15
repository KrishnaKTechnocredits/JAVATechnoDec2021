package jayashri;

public class Test2Prg2 {

	void findOccurance(int[] sum) {

		for (int i = 0; i < sum.length; i++) {
			int cnt = 0;
			for (int j = 0; j < sum.length; j++) {
				if (sum[i] == sum[j])
					cnt++;
			}

			if (cnt == 1) {
				System.out.println(sum[i]);
			}
		}
	}
	public static void main(String[] args) {
		Test2Prg2 test2Prg2 = new Test2Prg2();
		int[] arr = { 5, 8, 1, 2, 4, 3, 2, 1 };
		test2Prg2.findOccurance(arr);
	}
}
