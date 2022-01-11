package swati.swati_Exam2;

public class ArrayPair {
	int sum = 6;

	void findPair(int[] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++)
				if (sum == num[i] + num[j]) {
					System.out.println(num[i] + " " + num[j]);
				}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPair ap = new ArrayPair();
		int[] num = { 5, 1, 2, 7, 6, 3, 4, 9 };
		ap.findPair(num);
	}

}
