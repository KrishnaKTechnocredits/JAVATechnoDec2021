package swati.Swati_Assignment30;

public class assign30 {

	public static void main(String[] args) {
		int[] num = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {// 1 2 0 0 9
				for (int j = i + 1; j < num.length; j++) {
					if (num[i] < num[j]) {
						num[i] = num[j];
						num[j] = 0;
						break;
					}
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
