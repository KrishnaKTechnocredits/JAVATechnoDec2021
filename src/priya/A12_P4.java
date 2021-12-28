package priya;
import java.util.Scanner;

public class A12_P4 {

	void reverseNumber(int num) {
		System.out.println("Reverse Number is:   ");
		while(num !=0){
			int r = num%10;
			num = num/10;
			System.out.print(r);
		}
	}

	public static void main(String[] a) {
		A12_P4 a12_P4_ReverseNumber = new A12_P4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number:  ");
		int number = sc.nextInt();

		a12_P4_ReverseNumber.reverseNumber(number);
		sc.close();


	}
}