package tanu;

import java.util.Arrays;
class Exam1 {
	int first = 0;
	int second = 0;
	char arrayvalue;
	void sumOfAllArrayPair(int[] num) {
		for (int index = 0; index < num.length - 1; index++) {
			first = num[index];
			for (int position = index + 1; position < num.length; position++) {
				second = num[position];
				if (first + second == 6) {
					System.out.println("Pair is " + first + "," + second);
				}
			}
		}
	}

	void singleOccurrenceElement(int[] num) {
		for (int index = 0; index < num.length; index++) {
			int isDuplicate = 0;
			first = num[index];
			for (int position = 0; position < num.length; position++) {
				second = num[position];
				if (first == second) {
					isDuplicate++;
				}
			}
			if(isDuplicate == 1)
			{
				System.out.println(num[index] + " is Unique numbers in array");
			}
		}
	}

	public static void main(String[] arg) {
		Exam1 exam1 = new Exam1();
		int[] userinputarray = {5,1,2,7,6,3,4,9} ;
		int[] userinputarray1 = {5,8,1,2,4,3,2,1} ;
		exam1.sumOfAllArrayPair(userinputarray);
		exam1.singleOccurrenceElement(userinputarray1);
	}
}
