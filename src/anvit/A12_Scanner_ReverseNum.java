package anvit;
import java.util.Scanner;
public class A12_Scanner_ReverseNum {
	
	int getNumberReverse(int num) {
		int value = 0;
		while (num!=0) {
			int a = num % 10;
			value = value * 10 + a;
			num = num/10;
		}
		return value;
	}

	public static void main(String[] args) {
		A12_Scanner_ReverseNum a12_Scanner_ReverseNum = new A12_Scanner_ReverseNum();
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter the number to be reversed");
		int toReverse = scanner.nextInt();
		int reversedNumber = a12_Scanner_ReverseNum.getNumberReverse(toReverse);
		System.out.println("Reversed number is '" + reversedNumber + "'");
	}
}
