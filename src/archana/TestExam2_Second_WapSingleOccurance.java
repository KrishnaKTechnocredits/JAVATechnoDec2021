package archana;

public class TestExam2_Second_WapSingleOccurance {
	void wapSingleOccurance(int[] num) {
		boolean chk;
		for (int index = 0; index < num.length; index++) {
			chk = false;
			for (int index2 = 0; index2 < num.length; index2++) {
				if (index != index2 && num[index] == num[index2]) {
					chk = true;
					break;
				}
			}
			if (!chk) {
				System.out.print(num[index] + " ");
			}
		}
	}
	static public void main(String[] args) {
		int[] num = { 5, 8, 1, 2, 4, 3, 2, 1 };
		TestExam2_Second_WapSingleOccurance testExam2Second = new TestExam2_Second_WapSingleOccurance();
		System.out.println("Single Ocurrance in array are : ");
		testExam2Second.wapSingleOccurance(num);

	}
}
