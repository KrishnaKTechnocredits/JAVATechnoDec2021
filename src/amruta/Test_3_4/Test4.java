/*	 1. How to find all pairs in an array of integers whose sum is equal to the given number
i/p  : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}   */

package amruta.Test_3_4;

class Test4 {
	
	//21st Logic
	void printUniqueElement(int[] arr) {
		System.out.println("1st Logic \n" + "Element occurs once in givenn array :");

		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int innerindex = 0; innerindex < arr.length; innerindex++) {

				if (arr[index] == arr[innerindex]) {
					count++;
				}
			}
			if (count != 2) {
				System.out.println(arr[index]);
			}
		}
	}

	//2nd Logic
	void singleOccurrenceElement(int[] arr) {
		System.out.println("\n2nd Logic \n" + "Element occurs once in givenn array :");

		int[] op = new int[arr.length];
		int numcount = 0;

		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int innerindex = 0; innerindex < arr.length; innerindex++) {

				if (arr[index] == arr[innerindex]) {
					count++;
				}
			}
			if (count == 1) {
				op[numcount] = arr[index];
				numcount++;
			}
		}
	//  System.out.println(Arrays.toString(op));
		System.out.print("{");
		for (int index = 0; index < op.length; index++) {
			if (op[index] != 0)
				System.out.print(op[index] + ",");
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		int[] input = { 5, 8, 1, 2, 4, 3, 2, 1 };
		Test4 test = new Test4();
		test.printUniqueElement(input);
		test.singleOccurrenceElement(input);
	}
}
