package krishna;

import java.util.Scanner;

public class Assignment_12_CharManipulation {
	int charInString(String word , char c){    
		int i =0;
	    int temp =0;
		for (i=0; i<word.length(); i++) {
			if (word.charAt(i)==c){
				temp++;
			}
		}
			return temp;
	}

	void fNon_RepeatingChar(String word1){
		int i;
		int counter=0;
		for (i=0; i < word1.length(); i++) {
			counter = charInString(word1, word1.charAt(i));
			if (counter == 1) {
				System.out.println("The first non Reapeating character is : " + word1.charAt(i));
				break;
			}
		}
	}
	
	void f_RepeatingCharacter(String word2){
		int j;
	    int serial=0;
	    for (j=0; j<word2.length(); j++) {
	    	serial = charInString(word2, word2.charAt(j));
	    	 if (serial == 2) {
	    		 System.out.println("The first Reapeating character is : " + word2.charAt(j));
	    		 break;
	    	}
		}
	}
	
	String rev_String(String para){
		String reverse="";
		for(int index=para.length()-1; index>=0; index--){
			reverse = reverse + para.charAt(index);
		 }
		System.out.println("The reverse character are : ");	
		return reverse;
	}
	 
	public static void main(String[] arr) {
		Assignment_12_CharManipulation charmanipulation = new Assignment_12_CharManipulation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
	    String get = scanner.next();
		charmanipulation.fNon_RepeatingChar(get);
		charmanipulation.f_RepeatingCharacter(get);
		String rev_String = charmanipulation.rev_String(get);
		System.out.println(rev_String);
		scanner.close();
	}
}
