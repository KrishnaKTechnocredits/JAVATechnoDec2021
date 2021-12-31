package yogeshNagar;

import java.util.Scanner;

public class A12_ReverseNumber {
	
	int getReverseNumber(int num) {
		System.out.println("Given number is "+num);
		int rev = 0;
		while(num>0) {
			int r = num%10;
			rev = rev*10 + r;
			num = num/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		A12_ReverseNumber revNum= new A12_ReverseNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		System.out.println("Reverse of given Number is " + revNum.getReverseNumber(scanner.nextInt()));
		scanner.close();
		
	}
	

}
