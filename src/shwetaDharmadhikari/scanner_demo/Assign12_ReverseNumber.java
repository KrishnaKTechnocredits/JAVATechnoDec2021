/*
 * 6. Reverse number [program - 4]
 */
package shwetaDharmadhikari.scanner_demo;

import java.util.*;

public class Assign12_ReverseNumber {

	void reverseNumber(int number) {
		int remainder;
		while (number > 0) {
			remainder = number % 10;
			System.out.print(remainder);
			number = number / 10;
		}
	}

	/*
	 * Another Way: 
	 * int reverseNumber(int number){ 
	 * 	number reverse=0; 
	 * 	int remainder=0; 
	 * 	while(number>0) { 
	 * 		remainder=number%10;
	 * 		reverse=(reverse*10+remainder); 
	 * 		number=number/10; 
	 * 	}
	 *  	return reverse; 
	 *  }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		Assign12_ReverseNumber rv = new Assign12_ReverseNumber();
		System.out.println("Reverse number is :");
		rv.reverseNumber(num);

	}

}
