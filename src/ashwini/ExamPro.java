package ashwini;

public class ExamPro {
	// to find all pairs whose sum is 6
	void sumPairs(int[] b, int sum) {
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] + b[j] == sum) {
					System.out.println("{" + b[i] + "," + b[j] + "}");
					// System.out.println(b[j]);

				}
			}
		}
	}

	// To find single occcurrence
	void singleOcuurrence(int[] f) {

		for (int index = 0; index < f.length; index++) {
			int s = 0;
			for (int index1 = 0; index1 < f.length; index1++) {
				if (f[index] == f[index1]) {

					s++;
				}

			}
			if (s == 1) {
				System.out.println(f[index] + " ");
			}
		}
	}

	public static void main(String[] arr) {
		ExamPro e = new ExamPro();
		int[] a = { 5, 1, 2, 7, 6, 3, 4, 9 };
		int sum = 6;
		e.sumPairs(a, sum);
		int[] c = { 5, 8, 1, 2, 4, 3, 2, 1 };

		e.singleOcuurrence(c);

	}
}