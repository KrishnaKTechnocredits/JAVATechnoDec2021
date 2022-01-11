package apurva;

/*1. How to find all pairs in an array of integers whose sum is equal to the given number
i/p  : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}



2. WAP to print a single occurrence element from the array in Java?
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}
*/

public class Exam_2_Array {

	void displaySumofPair(int[] num) {
		int count = 0;
		for (int index = 0; index < num.length - 1; index++) {
			int temp = index + 1;
			for (; temp < num.length - 2; temp++) {
				if ((num[index] + num[temp]) == 6) {
					System.out.println(num[index] + "," + num[temp]);
					count++;
				}
			}
		}
	}

	void displaySingleOccurenceElement() {
		int[] num = { 5, 8, 1, 2, 4, 3, 2, 1 };
		int count = 0;
		int index = 0;
		for (; index < num.length - 1; index++) {
			int temp = index + 1;
			for (; temp < num.length - 1; temp++) {
				if (num[index] != num[temp])
					System.out.println(num[index]);
				break;
			}
		}

	}

	public static void main(String[] args) {
		Exam_2_Array test = new Exam_2_Array();
		int[] a = { 5, 8, 1, 2, 4, 3, 2, 1 };
		test.displaySumofPair(a);
		System.out.println("           ");
		Exam_2_Array test1 = new Exam_2_Array();
		System.out.println("Single Occurence in array");
		test1.displaySingleOccurenceElement();
	}

}
