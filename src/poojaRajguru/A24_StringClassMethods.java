package poojaRajguru;

import java.util.Arrays;

public class A24_StringClassMethods {
	void totalWordsAndLength(String str) {
		int len;
		String[] arr = str.split(" ");
		System.out.println("The Total words in Given string are : " + arr.length);		
		for(int index = 0 ;index<arr.length;index++) {
			len = arr[index].length();
			System.out.println("The length of " + arr[index]  + " is -->  " + len);
		}
	}
	
	void totalVowelsInEachWord(String str) {		
		String[] arr = str.split(" ");
		System.out.println("The String is : " + Arrays.toString(arr));
		for( int index=0; index<arr.length;index++) {
			String str1;
			int cnt = 0;
			str1 = arr[index];
			for( int i =0;i<str1.length();i++) {
				char ch =str1.charAt(i);
				if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' ) 
					cnt++;				
			}	
			System.out.println("The Vowels in string " + arr[index] +" --> "  + cnt);
		}				
	}
	
	void digitsInString(String str2) {
		String[] arr = str2.split(" ");
		System.out.println("The String is : " + Arrays.toString(arr));
		for(int index = 0; index < arr.length; index++) {
			String result = "";
			int len = arr[index].length();
			String element = arr[index];
			for(int i = 0; i<len ;i++) {
				char ch = element.charAt(i);
				if(Character.isDigit(ch)) 
					result= result + ch;				
			}
			arr[index] = result;				
		}
		System.out.println("The Result is : " + " "  + Arrays.toString(arr) +  " ");
	}

	void reverseStringOnSameIndex(String str3) {
		String[] arr = str3.split(" ");
		System.out.println("String is : " + Arrays.toString(arr));
		for(int index = 0; index < arr.length ; index++ ){
			String temp = arr[index];
			int len = temp.length();
			String output = "";
			for(int i = len-1; i>=0 ; i-- ) {
				char ch = temp.charAt(i);
				output+=ch;				
			}
			arr[index]=output;
		}
		System.out.println("Reversed String is : " + Arrays.toString(arr));
	}
	
	void convertFirstCharToUpperCase(String str4) {
		String[] arr = str4.split(" ");
		System.out.println("The String is : " + Arrays.toString(arr));
		for(int index=0;index<arr.length;index++) {
			String str = arr[index]; 
			char ch = str.charAt(index);
			String output ="";
			output=output + Character.toUpperCase(str.charAt(0));
			for(int rem=1;rem<str.length();rem++) {
				output = output + str.charAt(rem);
			}
			arr[index]= output;
		}			
		System.out.println("The Resultant String : " + Arrays.toString(arr));
	}
	
	void reverseWordAndConvertFirstCharToUpperCase(String str5) {
		String[] arr = str5.split(" ");
		System.out.println("String is : " + Arrays.toString(arr));
		for(int index = 0; index < arr.length ; index++ ){
			String temp = arr[index];
			int len = arr[index].length();
			String output = "";
			output=output + Character.toUpperCase(temp.charAt(len-1));
			for(int i = len-2; i>=0 ; i-- ) {
				output+=temp.charAt(i);				
			}
			arr[index]=output;
		}
		System.out.println("Reversed String is : " + Arrays.toString(arr));
	}
	
	void convertCaseOfCharactersOfString(String str6) {
		System.out.println("The Given String is : " + str6);
		String output = "";
		for(int index = 0;index<str6.length();index++) {
			char ch = str6.charAt(index);
			if(Character.isLetter(ch)) {
				if(Character.isLowerCase(ch)) {
					output = output + Character.toUpperCase(ch);
				}else			
					output = output + Character.toLowerCase(ch);
			}		
		}
		System.out.println("The Resultant String is : " + output);		
	}
	
	public static void main(String[] args) {
		A24_StringClassMethods scm = new A24_StringClassMethods();
		String str = "Hi Hello";
		scm.totalWordsAndLength(str);
		System.out.println("------------------------------");
		String str1 = "aashvi technocredits";
		scm.totalVowelsInEachWord(str1);
		System.out.println("------------------------------");
		String str2 = "te1c2h c94re3 ";
		scm.digitsInString(str2);
		System.out.println("------------------------------");
		String str3 = "Hi techno Hello";
		scm.reverseStringOnSameIndex(str3);
		System.out.println("------------------------------");
		String str4 = "avnit harsh dipali";
		scm.convertFirstCharToUpperCase(str4);
		System.out.println("------------------------------");
		String str5 ="Vrushali Sagar Shital";
		scm.reverseWordAndConvertFirstCharToUpperCase(str5);
		System.out.println("------------------------------");
		String str6 = "TeCHnoCReditS";
		scm.convertCaseOfCharactersOfString(str6);		
	}
} 