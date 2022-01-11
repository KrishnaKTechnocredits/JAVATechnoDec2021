package ashwini;

public class ExamPro {
	// to find all pairs whose sum is 6

	void sumPairs(int[] b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] + b[j] == 6) {
					System.out.println(b[i] + " " + b[j]);
					// System.out.println(b[j]);

				}
			}
		}
	}

	// To find single occcurrence
	void singleOcuurrence(int[] f) {
		int s = 0;
		for (int index = 0; index < f.length; index++) {
			for (int index1 = index + 1; index1 < f.length; index1++) {
				if (f[index] == f[index1]) {
					s = f[index1];
					System.out.print(s);// find duplicate elements only
				}

			}

		}

	}

	public static void main(String[] args) {
		ExamPro e = new ExamPro();
		int[] a = { 5, 1, 2, 7, 6, 3, 4, 9 };
		int[] c = { 5, 8, 1, 2, 4, 3, 2, 1 };
		e.sumPairs(a);
		e.singleOcuurrence(c);

	}
}
