package krishna;

import java.util.Scanner;

public class Assignment_13_indexOf {
	
	void findDupliChar(String provide) {
		char ch = ' ';
		System.out.println("The duplicate characters are : ");
		boolean flag = true;
		for (int index1 = 0; index1 < provide.length(); index1++) {
			ch = provide.charAt(index1);
			if (provide.indexOf(ch) == provide.lastIndexOf(ch)) {
				flag = false;
			}
			if (flag == true)
				System.out.println(ch);
		}
	}
		
	void uniqueChar(String test){
		String temp = "";
	    int i;
	    for ( i = 0; i < test.length(); i++){
	    	if (temp.indexOf(test.charAt(i)) == - 1){
	    		temp = temp + test.charAt(i);
	    	}
	    }
	    System.out.println( "The unique character are : " +temp + " ");
	}
	  
	void firstUniqueChar(String provide) {
		char alpha = ' ';
		for (int index = 0; index < provide.length(); index++) {
			alpha = provide.charAt(index);
			if (provide.indexOf(alpha) == provide.lastIndexOf(alpha)) {
				System.out.println("The first unique character is : " + alpha);
				break;
			}
		}
	}
	  
	void firstDupliChar(String provide) {
		char c = ' ';
		for (int index1 = 0; index1 < provide.length(); index1++) {
			c = provide.charAt(index1);
			if (provide.indexOf(c) != provide.lastIndexOf(c)) {
				System.out.println("The first duplicate character is : " + c);
				break;
			 }
		 }
     }
	
	 public static void main (String[]args){
		 Scanner kb = new Scanner (System.in); 
		 String word = "";
		     
		 System.out.println("Enter a word: ");
		 word = kb.next();
		 System.out.println("************************************************");
		     
		 Assignment_13_indexOf ass13 = new Assignment_13_indexOf();
		 ass13.uniqueChar(word); 
		 ass13.findDupliChar(word);
		 ass13.firstUniqueChar(word);
		 ass13.firstDupliChar(word);
	 }
}
