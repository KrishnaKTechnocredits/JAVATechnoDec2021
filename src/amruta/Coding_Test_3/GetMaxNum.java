/*   Write a program to find max digit from given number.
Input will be as number format only, DO NOT CHANGE NUMBER INTO STRING

Input : 6832774
Output :8    */

package amruta.Coding_Test_3;

class GetMaxNum {

	void getMaxDigit(int num) {

		int maxnum = 0;
		int ans = 0;

		while (num > 0) {
			ans = num % 10;

			if (maxnum < ans) {
				maxnum = ans;
				System.out.println("\nmaxnumber : " + maxnum);
			}

			num = num / 10;
			System.out.println("\nnumber after division : " + num);
		}
		System.out.print("\n------------------------------------------------------\n ");
		System.out.print("\nMaximum digit from given number is ----> " + maxnum);
	}

	public static void main(String[] args) {
		GetMaxNum getmaxnum = new GetMaxNum();

		new GetMaxNum().getMaxDigit(6832774);
	}

}