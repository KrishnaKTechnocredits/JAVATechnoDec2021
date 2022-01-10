/*6. Reverse number [program - 4]*/

package shivangi.Assignment12_Scanner;

import java.util.Scanner;

public class A12_5_ReverseNum {
	
	void findReverseNum(int num) {
		int rev = 0;
		while(num>0) {
			int r = num%10;
			rev = rev*10 + r;
			num = num/10;
		}
		System.out.println("Reverse num is : "+rev+" ");
	}
	
	public static void main(String[] args) {
		A12_5_ReverseNum a12_5_ReverseNum = new A12_5_ReverseNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		a12_5_ReverseNum.findReverseNum(num);
		scanner.close();
	}
}
