//two for loops practice
package sagarAcharya;
import java.util.Scanner;

class A12_p3_findNonRepeatingChar{
	
	void findChar(String input){
		//char ch = input.charAt();
		for(int i = 0; i<input.length();i++){
			char ch = input.charAt(i);
			int count  = 0;
			for(int innerI=0;innerI<input.length();innerI++){
				if(input.charAt(innerI) == ch)
					count++;
		}
		if(count == 1){
		System.out.println("First non repeating character is : " + ch);
		break;
		}
	}
	
}
	void findRepeatingChar(String input1){
		for(int i = 0; i<input1.length();i++){
			char ch = input1.charAt(i);
			int count  = 0;
			for(int innerI=0;innerI<input1.length();innerI++){
				if(input1.charAt(innerI) == ch)
					count++;
		}
		if(count > 1){
			System.out.println("First repeating character is : " + ch);
			break;
		}
	}
}
	
	public static void main(String[] args){
		A12_p3_findNonRepeatingChar a12 = new A12_p3_findNonRepeatingChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input for first non repeating character: ");
		String i = sc.next();
		a12.findChar(i);
		System.out.println("Enter your input for first repeating character: ");
		String i1 = sc.next();
		a12.findRepeatingChar(i1);
	}
}

/* 1. print freq of each character in given String. [prgram-1]
2. find max primenumber from given range. [range : 2 to 100, ans ; 97] [program-2]
3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h
4. find the first repeating character from given string. [program-3]
   input : shivangi
   output : i
5. write a method to return the reverse string. [program-3] */