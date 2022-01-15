package swati.swati_Exam2;

public class Occur {

	int findSingle(int num) {
		int count = 0;
		int countTemp = 0;
		int[] arr = { 5, 8, 1, 2, 4, 3, 2, 1 };

		for (int j = 0; j < arr.length; j++) {
			if (num == arr[j]) {
				count++;
				countTemp = count;
			}

		}
		return countTemp;
	}

	public static void main(String[] args) {
		Occur oc = new Occur();
		int[] num = { 5, 8, 1, 2, 4, 3, 2, 1 };
		for (int i = 0; i < num.length; i++) {
			int count = oc.findSingle(num[i]);
			if (count == 1) {
				System.out.println(num[i]);
			}

		}
	}
}
