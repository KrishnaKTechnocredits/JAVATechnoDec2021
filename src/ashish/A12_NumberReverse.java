package ashish;

import java.util.Scanner;

public class A12_NumberReverse {

	void reverseNumber(int num) {
		int r = 0, reverseNumber = 0;
		int number = num;
		while(num>0) {
			r = num % 10;
			reverseNumber = (reverseNumber * 10) + r;
			num = num / 10;			
		}
		System.out.println(" Reverse of " + number + " is : " + reverseNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a number to reverse : ");
		int num = scanner.nextInt();
		A12_NumberReverse numberReverse = new A12_NumberReverse();
		numberReverse.reverseNumber(num);
		scanner.close();
	}
}
