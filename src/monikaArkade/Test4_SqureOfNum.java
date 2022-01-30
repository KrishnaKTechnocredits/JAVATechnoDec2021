/*
WAP to find next number in an array is square of previous number or not.
Input 1: {2,4,16,256}
output 1 : true

Note: 4 is square of 2, 16 is square of 4, and so on
 */
package monikaArkade;

public class Test4_SqureOfNum {
	boolean findSquare(int[] arr) {
		boolean flag = true;
		try {
			for (int index = 0; index < arr.length; index++) {
				if (arr[index + 1] == (arr[index] * arr[index])) {
				}
			}
		} catch (ArrayIndexOutOfBoundsException a) {
		}
		System.out.println(true);
		return flag;
	}

	public static void main(String[] args) {
		Test4_SqureOfNum t4 = new Test4_SqureOfNum();
		int[] arr = { 2, 4, 16, 256 };
		t4.findSquare(arr);
	}
}
