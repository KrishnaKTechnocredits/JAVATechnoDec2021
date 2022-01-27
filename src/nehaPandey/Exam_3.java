package nehaPandey;

//Program - 1 : WAP to find next number in an array is square of previous number or not
//Input 1: {2,4,16,256}
//output 1 : true
//Note: 4 is square of 2, 16 is square of 4, and so on

public class Exam_3 {

	void findNextNumberInAnArrayIsSquareOfPreviousNumberOrNot(int[] arr) {

		boolean flag = false;
		for (int index = 0; index < arr.length - 1; index++) {
			int previousNum = arr[index];
			int nextNum = arr[index + 1];
			previousNum = previousNum * previousNum;
			if (previousNum == nextNum) {
				flag = true;
			} else {
				flag = false;
				break;
			}

		}
		System.out.println(flag);

	}

	public static void main(String[] args) {
		Exam_3 exam3 = new Exam_3();
		System.out.println("Program1:Output");
		int[] input = { 2, 4, 16, 256 };
		exam3.findNextNumberInAnArrayIsSquareOfPreviousNumberOrNot(input);

	}
}
