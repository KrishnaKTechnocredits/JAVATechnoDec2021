package monikaArkade;

public class Test2_P1 {

	void findPair(int[] num, int sum) {
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == sum)
					System.out.println("{" + num[i] + "," + num[j] + "}");
			}
		}
	}

	public static void main(String[] args) {
		Test2_P1 p1 = new Test2_P1();
		int[] num = { 5, 1, 2, 7, 6, 3, 4, 9 };
		int sum = 6;
		p1.findPair(num, sum);
	}
}
