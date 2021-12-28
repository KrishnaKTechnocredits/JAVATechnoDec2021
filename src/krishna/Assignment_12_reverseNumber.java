package krishna;

import java.util.Scanner;

	public class Assignment_12_reverseNumber {
	
		int rev_Num(int num){
			int rev = 0;
			int rem = 0;
			while(num > 0) {
				rem = num % 10;
				rev = (rev * 10 + rem);
				num = num/10;
			}
			return rev;
		}
	
	public static void main(String[] args) {
		Assignment_12_reverseNumber  revnum = new  Assignment_12_reverseNumber();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scanner.nextInt();
		
		int res = revnum.rev_Num(num);
		System.out.println("The Reverse of entered number is : "+ res);
		scanner.close();
	
	}

}