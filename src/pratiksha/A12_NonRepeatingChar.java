package pratiksha;

import java.util.Scanner;

public class A12_NonRepeatingChar {

	void ReverseString(String str) {
		String reverse="";
		for(int index=str.length()-1;index>=0;index--) {
			char ch= str.charAt(index);
			reverse=reverse+ch;
		}
		  System.out.println("the reverse string is: "+reverse);
	}
	int countCharacters(String name,char ch) {
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==ch) {
				count++;
			}	
		}
		     return count;
    }
	void firstnoneRepeating(String input) {
		int cnt=0;
		for(int i=0;i<input.length(); i++) {
		cnt=countCharacters(input,input.charAt(i));
				if(cnt==1){
					System.out.println("the first none repeating character is: "+input.charAt(i));
				}
				break;
		}
		        if(cnt>1) {
		        	System.out.println("No repeating character is found");
		    	}
	}
	void repeating(String input) {
		int cnt=0;
		for(int i=0;i<input.length(); i++) {
			cnt=countCharacters(input,input.charAt(i));
			   if(cnt>1) {
				     System.out.println("the first repeating character is: "+input.charAt(i));
				     break;
			   }
			   
		}
		      if(cnt==1) {
		    	     System.out.println("No first repeating character");
		      }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String name=sc.nextLine();
		A12_NonRepeatingChar occurence = new A12_NonRepeatingChar();
		occurence.ReverseString(name);
		occurence.firstnoneRepeating(name);
		occurence.repeating(name);
		
	}
}
