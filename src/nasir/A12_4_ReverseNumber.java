package nasir;

import java.util.Scanner;

public class A12_4_ReverseNumber {
 void reverseNumber(int number) {
	 int reverse=0;
	 for(int index=number;index>0;) {
		 int remainder = index%10;
		 reverse =reverse*10+remainder;
		 index=index/10;
	 }
	 System.out.println(reverse);
 }
 public static void main(String[] args) {
	A12_4_ReverseNumber reverseNumber =new A12_4_ReverseNumber();
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the number");
	int input=scanner.nextInt();
	reverseNumber.reverseNumber(input);
}
}
