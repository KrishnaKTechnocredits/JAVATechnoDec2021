/*
 * Assignment - 14 : 29th Dec'2021
In a given string, print "Java" if duplicate characters are more than unique characters, else print "Selenium".
Take string from user.
input : technocredits
output : Selenium
Explanation : 
In technocredits, duplicate characters are t,e,c (character count = 3) , unique characters hnordis (character count = 7)
Here, unique character count > duplicate character count.
you should print Selenium.
input : abcdabc
output : Java
 */
package anjali;

import java.util.Scanner;

public class Anjali_Assignment14 {
	
	void compareCount(String name){
		String z="";  
		int countUnique=0,countDublicate=0;
		char ch=' ';
		for(int index=0;index<name.length();index++){
			ch= name.charAt(index);
			if(name.indexOf(ch)==name.lastIndexOf(ch))
				countUnique++;
			else if(!z.contains(String.valueOf(name.charAt(index)))) { 
				z=z+String.valueOf(name.charAt(index));
				countDublicate++;
			}	
		}
		     System.out.println("The count of Unique elements is : "+countUnique);
			 System.out.println("The count of Dublicate elements is : "+countDublicate);
			 
			 if(countDublicate>countUnique)
				 System.out.println("Java");
			 else
				 System.out.println("Selenium");
	 }
	
	public static void main(String[] args) {
		Anjali_Assignment14 assignment14= new Anjali_Assignment14();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the String :");
		String input=scanner.next();
		assignment14.compareCount(input);
		System.out.println("Please Enter the String :");
		String input1=scanner.next();
		assignment14.compareCount(input1);
		scanner.close();
		
	}

}
