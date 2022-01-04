package poojaRajguru;

import java.util.Scanner;

public class A12_StringOperationScanner {

	boolean isPrime(int num) {
		boolean flag = true;
		if(num <= 0 || num ==1) {
			flag = false;
		} else {
			for(int index = 2; index <= (num/2); index++) {
				if(num % index == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	void findFrequencyOfChar(String str) {
		int count;
		for(int index = 0; index < str.length(); index++) {
			count = 0;
			for(int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				if(str.charAt(index) == str.charAt(innerIndex))
					count++;
			}
			System.out.println(str.charAt(index) + " : " + count);
		}
	}

	void findMaxNumberInRange(int start, int end) {
		boolean res;
		int max=-1;
		for(int index = start; index <= end; index++) {
			res = isPrime(index);
			if(res == true)
				max = index;
		}
		System.out.println("Max prime number in range " + start + " to " + end + " is : " + max);
	}

	void findChar(String str1){
		System.out.println("The string is: " + str1);
		for (int i = 0; i < str1.length(); i++) {
			boolean flag = true;
			for (int j = 0; j < str1.length(); j++) {
				if (i != j && str1.charAt(i) == str1.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("The first non repeated character in String is: " + str1.charAt(i));
				break;
			}
		}
	}

	void firstRepeatChar(String str2) {
		for(int index = 0; index < str2.length(); index++) {
			int count = 0;
			for(int innerIndex = 0; innerIndex < str2.length(); innerIndex++)
				if(str2.charAt(innerIndex) == str2.charAt(index))
					count++;
			if(count > 1) {
				System.out.println("The first non repeated character in String is: " + str2.charAt(index));
				break;
			}
		}
	}		

	String reverseOfString(String str3) {
		String revStr = "";
		for(int index = str3.length()-1; index >= 0; index--)
			revStr = revStr + str3.charAt(index);
		return revStr;
	}

	int reverseOfNumber(int num) {
		int revnum = 0;
		while(num > 0) {
			revnum = revnum * 10 + (num % 10);
			num = num / 10;
		}
		return revnum;
	}

	public static void main(String[] args) {
		A12_StringOperationScanner stringOperationScanner = new A12_StringOperationScanner();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string : ");
		String input = sc.next();
		stringOperationScanner.findFrequencyOfChar(input);

		System.out.println("Enter start number of range : ");
		int start= sc.nextInt();
		System.out.println("Enter last number of range : ");
		int end= sc.nextInt();
		stringOperationScanner.findMaxNumberInRange(start, end);

		System.out.println("Please enter the string : ");
		String str1= sc.next();
		stringOperationScanner.findChar(str1);

		System.out.println("Please enter the string : ");
		String str2= sc.next();
		stringOperationScanner.firstRepeatChar(str2);

		System.out.println("Please enter the string : ");
		String str3= sc.next();
		String ans = stringOperationScanner.reverseOfString(str3);
		System.out.println("The Reversed String Is : " + ans);

		System.out.println("Please enter the number : ");
		int num1 = sc.nextInt();
		int revNum = stringOperationScanner.reverseOfNumber(num1);
		System.out.println("The Reversed String Is : " + revNum);

		sc.close();
	}
}

