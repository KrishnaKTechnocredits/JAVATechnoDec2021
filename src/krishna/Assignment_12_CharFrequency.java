package krishna;

import java.util.Scanner;

 public class Assignment_12_CharFrequency{
	
	 public static void main(String[] args) {
		 String str;
		 int i,  counter = 0;
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter a String");
		 str = scanner.nextLine();
		 
		 int length = str.length();
		 for (i = 0; i <str.length(); i++) {
			 counter++;
			 if(counter == str.charAt(i)) {
				 break;
			 }
			 System.out.println("The character present in string is  :  " +str.charAt(i) + "   and their frequency is -->  " + counter);
		 }
	 }
 }
 