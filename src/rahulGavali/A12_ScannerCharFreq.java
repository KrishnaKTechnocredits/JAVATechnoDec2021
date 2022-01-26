package rahulGavali;

/*Assignment - 12:
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


import java.util.Scanner;

public class A12_ScannerCharFreq{

	int charFrequency(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch1 = input.charAt(index);
			if (ch1 == ch)
				count++;
		}
		return count;
	}

	void inputFromUser() {
		System.out.println("Program1: Enter the string to know the count of each character: ");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		for (int index = 0; index < input1.length(); index++) {
			int cnt = charFrequency(input1, input1.charAt(index));
			if (input1.indexOf(input1.charAt(index)) == index)
				System.out.println(input1.charAt(index) + " : " + cnt);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A12_ScannerCharFreq scannerClass = new A12_ScannerCharFreq();
		scannerClass.inputFromUser();
	}
}