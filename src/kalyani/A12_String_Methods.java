package kalyani;

import java.util.Scanner;

class A12_String_Methods {

	int getFrequency(String input ,char ch) {
		int count =0;
		for(int index =0;index<input.length();index++) {
			if(input.charAt(index) == ch )
				count++;
		}
		return count;
	}

	void nonRepeatingChar(String input){
		for(int index=0;index<input.length();index++){
			char ch =input.charAt(index);
			int cnt =getFrequency(input,ch);
			if(cnt == 1){
				System.out.println("First non repeating character from inputed string : " +ch);
				break;
			}
		}
	}

	void firstRepeatingChar(String input){
		for(int index=0;index<input.length();index++){
			char ch =input.charAt(index);
			int cnt =getFrequency(input,ch);
			if(cnt != 1){
				System.out.println("First repeating character from inputed string  : " +ch);
				break;
			}
		}
	}

	String reverseString(String input){
		String rev = "";
		for(int index=input.length()-1;index>=0;index--){
			char ch = input.charAt(index);
			rev = rev+ch;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String : ");
		String input =sc.next();
		A12_String_Methods stringOperations = new A12_String_Methods();
		stringOperations.nonRepeatingChar(input);
		stringOperations.firstRepeatingChar(input);
		String str =stringOperations.reverseString(input);
		System.out.println("Reverse String is : " + str);
		sc.close();
	}
	
}