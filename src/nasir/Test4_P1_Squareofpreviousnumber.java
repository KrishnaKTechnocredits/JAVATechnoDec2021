package nasir;
/*Program - 1 : WAP to find next number in an array is square of previous number or not
Input 1: {2,4,16,256}
output : true
Note: 4 is square of 2, 16 is square of 4, and so on*/

public class Test4_P1_Squareofpreviousnumber {
	static boolean isNumberSquareOfPreviousNumber(int[] input) {
		boolean flag = false;
		int count = 0;
		for (int index = 0; index < input.length - 1; index++) {
			int ans = input[index];
			if ((ans * ans) == input[index + 1]) {
				count++;
			}
			if (count == input.length - 1)
				flag = true;
			else
				flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 16, 256 };
		boolean ans2 = isNumberSquareOfPreviousNumber(arr);
		System.out.println(ans2);
	}
}
