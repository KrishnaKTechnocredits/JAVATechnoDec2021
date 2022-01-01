package monikaArkade;
import java.util.Scanner;

public class A14_Assignment14 {
	int duplicateCount;
	int uniqueCount;
	int getDuplicateChar(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(index == input.indexOf(ch))
				if(input.indexOf(ch)!= input.lastIndexOf(ch)) {
					//System.out.println(ch);
					duplicateCount +=1;
				}
		}
		return duplicateCount;
	}
	
	int getUniqueChar(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(index == input.indexOf(ch))
				if(input.indexOf(ch) == input.lastIndexOf(ch)) {
					//System.out.println(ch);
					uniqueCount +=1;
				}
		}
		return uniqueCount;
	}
	
	void printData() {
		if(uniqueCount>duplicateCount)
			System.out.println("Selenium");
		else
			System.out.println("Java");
	}
	
	public static void main(String[] args) {
		A14_Assignment14 a14_Assignment = new A14_Assignment14();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.next();
		a14_Assignment.getDuplicateChar(input);
		a14_Assignment.getUniqueChar(input);
		a14_Assignment.printData();
	}
}
