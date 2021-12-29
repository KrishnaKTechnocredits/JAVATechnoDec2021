package pradeep;

import java.util.Scanner;

public class A12_Program1 {
	int count;
	
	//This method finds character in String
	int findCharInString(String input, char ch) {
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index) == ch) {
				count++;
			}			
		}
		return count;
	}
	
	//This method finds frequency of each character in string
	void findFreqOfEachCharInString(String input) {
		for(int index=0; index<input.length(); index++) {
			count=0;
			boolean flag = false;
			int totalCount = findCharInString(input, input.charAt(index));
			
			//check repetition of character
			for(int matchIndex=index-1; matchIndex>=0;matchIndex--) {
				if(input.charAt(index)==input.charAt(matchIndex)) {
					flag=true;
					break;
				}
			}
			
			if(flag == true) {
				//don't print anything
			}else {
			System.out.println(input.charAt(index) + " -> " + totalCount);
			}
		}
	}
			
	public static void main(String[] args) {
		A12_Program1 a12_Program1 = new A12_Program1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String input = sc.next();
		a12_Program1.findFreqOfEachCharInString(input);
		sc.close();
	}
}
