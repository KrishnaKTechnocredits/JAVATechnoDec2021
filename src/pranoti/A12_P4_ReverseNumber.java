package pranoti;
import java.util.Scanner;
public class A12_P4_ReverseNumber {
	
	void reverseNumber(int num) {
		int rev=0;
		while(num >0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num =num/10;
		}
		System.out.println("Reverse Number is :" +rev);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr number :");
		int num = sc.nextInt();
		A12_P4_ReverseNumber a12_P4_ReverseNumber =new A12_P4_ReverseNumber();
		a12_P4_ReverseNumber.reverseNumber(num);
		sc.close();
	}

}
