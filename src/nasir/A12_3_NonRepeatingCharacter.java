package nasir;

import java.util.Scanner;

public class A12_3_NonRepeatingCharacter {
	
	int firstNonRepeating(String name, char ch) {
		int count=0;
		for(int index=0;index<name.length();index++) {
			if(ch==name.charAt(index))
				count++;
		}
		return count;
	}
	
	int firstRepeating(String name, char ch) {
		int count=0;
		for(int index=0;index<name.length();index++) {
			if(ch==name.charAt(index))
				count++;
		}
		return count;
	}
	
	void reverseString(String name) {
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {					
				char ch=name.charAt(i);
				reverse=reverse+ch;
			}	
		System.out.println(reverse);
		}
	
	void setCharacterforNonRepeating(String name) {
		for(int index=0;index<name.length();index++) {
			int cnt=firstNonRepeating(name,name.charAt(index));
			if(cnt==1) {
				System.out.println("first non repeating character from given string is "+name.charAt(index));	
				break;
			}
		}	
	}
	void setCharacterforRepeating(String name) {
		for(int index=0;index<name.length();index++) {
			int cnt=firstNonRepeating(name,name.charAt(index));
			if(cnt>1) {
				System.out.println("first repeating character from given string is "+name.charAt(index));	
				break;
			}
		}	
	}
	
	public static void main(String[] args) {
		A12_3_NonRepeatingCharacter nrc =new A12_3_NonRepeatingCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String");
		String name1=scanner.next();
		nrc.setCharacterforNonRepeating(name1);
		System.out.println("Please Enter the other String");
		String name2=scanner.next();
		nrc.setCharacterforRepeating(name2);
		System.out.println("Please Enter the String for reverse String");
		String name3=scanner.next();
		nrc.reverseString(name3);
	}
}