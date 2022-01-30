package gauravk.ProgramTests;

import java.util.Arrays;

/*
 * Programming Test : 27th Jan'2022

Program - 2 : WAP to return a string having each word length is prime number from the given sentence.

Prime numbres are : 2, 3, 5, 7, 11, 13, 17, 19 ...

Examples:

Input 1 : I love my India

Output 1 : my India

Input 2 : I would like to have a cup of tea

Output 2 : would to cup of tea
 */
public class Program2 {
	
	String extractPrimeLengthString(String str) {
		String result="";
		
		str.trim();
		String[] str1 = str.split(" ");
		
		for(int j=0; j<str1.length; j++) {
			int len = str1[j].length();
			int count=0;
			for(int i=len; i>=1; i--) {
				if(len%i==0)
					count++;
			}
			if(count==2) {
				result += str1[j] + " ";
				result.trim();
			}
		}
		if(result.length()==0)
			return "(Sorry. no prime length words found in given string.)";
		else 
			return result;
	}
	
	public static void main(String[] args) {
		Program2 p2 = new Program2();
		String inputString1 = "I love my India";
		String inputString2 = "I would like to have a cup of tea";
		String inputString3 = "love abcdef";
		System.out.println("string having each word length is prime number from the string : ["+inputString1+"] \nOutput is: "+p2.extractPrimeLengthString(inputString1));
		System.out.println("string having each word length is prime number from the string : ["+inputString2+"] \nOutput is: "+p2.extractPrimeLengthString(inputString2));
		System.out.println("string having each word length is prime number from the string : ["+inputString3+"] \nOutput is: "+p2.extractPrimeLengthString(inputString3));
	}
}
