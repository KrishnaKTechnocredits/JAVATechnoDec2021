package sagarAcharya;

import java.util.Scanner;

class A14_CompareDuplicates{

	public static void main(String[] args){
		A14_CompareDuplicates a14 = new A14_CompareDuplicates();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input : ");
		String str = sc.next();
		a14.printDuplicateVUnique(str);
	}
	
	void printDuplicateVUnique(String input){
		int dupCnt = 0;
		int uniqCnt = 0;
		for(int index = 0;index<input.length();index++){
			char ch = input.charAt(index);
			if(index == input.indexOf(ch)){
				if(input.indexOf(ch) != input.lastIndexOf(ch)){
					dupCnt++;
				}
			}
			if(input.indexOf(ch) == input.lastIndexOf(ch)){
				uniqCnt++;
			}
		}
		if(dupCnt > uniqCnt){
			System.out.println("Java");
		}else
			System.out.println("Selenium");
	}
}

/* Assignment - 14 : 29th Dec'2021
In a given string, print "Java" if duplicate characters are more than unique characters, else print "Selenium".
Take string from user.

input : technocredits
output : Selenium

Explanation : 
In technocredits, duplicate characters are t,e,c (character count = 3) , unique characters hnordis (character count = 7)
Here, unique character count > duplicate character count.
you should print Selenium.

input : abcdabc
output : Java */
