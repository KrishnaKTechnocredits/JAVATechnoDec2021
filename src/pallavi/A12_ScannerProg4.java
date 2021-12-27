/* Assignment - 12 : 26th Dec'2021
 * Reverse number [program - 4]
 */

package pallavi;

import java.util.Scanner;

public class A12_ScannerProg4 {

	void getReverseNum(int num) {
		int revNum = 0;
		int rem = 0;
		while (num % 10 > 0) {
			rem = num % 10;
			num = num / 10;
			revNum = (revNum * 10) + rem;
		}
		System.out.println("Number in reverse order is : " + revNum);
	}

	public static void main(String[] arr) {
		A12_ScannerProg4 a12_ScannerProg4 = new A12_ScannerProg4();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number-");
		int num = scanner.nextInt();
		a12_ScannerProg4.getReverseNum(num);
		scanner.close();
	}
}
