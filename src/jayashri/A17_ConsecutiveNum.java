package jayashri;

public class A17_ConsecutiveNum {

	void findConsecutiveNumber(int[] num) {
		for (int index = 0; index < num.length - 2; index++) {
			if (num[index] + 1 == num[index + 1] && num[index] + 2 == num[index + 2]) {
				System.out.println("The consecutive numbers are : " + num[index] + " --> " + num[index + 1] + " --> " + num[index + 2]);
			}
		}
	}

	public static void main(String[] arr) {
		int[] num = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		A17_ConsecutiveNum a17_consecutiveNum = new A17_ConsecutiveNum();
		a17_consecutiveNum.findConsecutiveNumber(num);

	}
}
