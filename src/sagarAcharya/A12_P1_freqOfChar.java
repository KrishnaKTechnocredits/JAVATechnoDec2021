import java.util.Scanner;

class A12_P1_freqOfChar{
	void findFreq(String input,char ch){
		int count = 0;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i) == ch)
				count++;
		}
		//return count;
	}
	
	void printFreq(String input){
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);
			int cnt = findFreq(input,ch);
				System.out.println(ch + ":" + cnt);
		}
	}
	
	public static void main(String[] args){
		A12_P1_freqOfChar a12_p1_freqofchar = new A12_P1_freqOfChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		String input = sc.next();
		a12_p1_freqofchar.printFreq(input);
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

