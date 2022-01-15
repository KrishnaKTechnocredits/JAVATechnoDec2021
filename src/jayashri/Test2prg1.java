package jayashri;

public class Test2prg1 {
	
	void findSum(int[] sum) {
		for (int i = 0; i < sum.length - 1; i++) {
			for (int j = i + 1; j < sum.length; j++) {
				if (sum[i] + sum[j] == 6) {
					System.out.println(sum[i] + " , " + sum[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		Test2prg1 test2Prg1 = new Test2prg1();
		int[] arr = { 5, 1, 2, 7, 6, 3, 4, 9 };
		test2Prg1.findSum(arr);
	}
}
