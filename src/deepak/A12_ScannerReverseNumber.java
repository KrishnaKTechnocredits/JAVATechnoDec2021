/*Assignment - 12: 26th Dec'2021
Write 4 different programs to satisfy below requirements, please take input from user using Scanner class. 
1. print freq of each character in given String. [Program-1]
2. find max prime number from given range. [range : 2 to 100, ans ; 97] [Program-2]
3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h
4. find the first repeating character from given string. [program-3]
   input : shivangi
   output : i
5. write a method to return the reverse string. [program-3]
6. Reverse number [program - 4]
*/
package deepak;

import java.util.Scanner;

public class A12_ScannerReverseNumber {
	
	int reverseNumber(int num) {
		int reverse = 0;
		while(num!=0) {
			int remainder = num%10;
			reverse = reverse*10+remainder;
			num = num/10;
		}
		return reverse;
	}
	
	void inputFromUser() {
		System.out.println("Program 6: Enter the number to get the reverse of the number: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(reverseNumber(input));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A12_ScannerReverseNumber scannerClass = new A12_ScannerReverseNumber();
		scannerClass.inputFromUser();
	}
}
