package nishika;

import java.util.Scanner;

public class A_12_stringPro {
	
	int getcharfreq(String name ,char ch) {
		int count =0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == ch)
				count++;		
		}
		return count;
	}
	void nonRepeatingChar(String name) {
		char chr =' ';
		for(int index=0;index<name.length();index++) {
			char ch =name.charAt(index);
			int count =getcharfreq(name ,ch);
			if(count == 1) {
				chr = ch;
				break;
			}
		}
		System.out.println("first non repeating character from given name "+ name + " is :" +chr);
	}
	
	void repeatingChar(String name) {
		char chr =' ';
		for(int index=0;index<name.length();index++) {
			char ch =name.charAt(index);
			int count =getcharfreq(name ,ch);
			if(count != 1) {
				chr = ch;
				break;
			}
		}
		System.out.println("first repeating character from given name "+ name + " is :" +chr);
	}
	
	void reverseString(String name) {
		String str = "";
		for (int index = name.length()-1;index >= 0;index--) {
			str = str +name.charAt(index);
		}
		System.out.println("Reverse String: "+str);
	}
	
	public static void main(String[] args) {
		A_12_stringPro string =new A_12_stringPro();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String name =sc.next();
		string.nonRepeatingChar(name);	
		string.repeatingChar(name);
		string.reverseString(name);
	}

}