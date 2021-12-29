package jagdish;

import java.util.Scanner;

public class StringAllProgram {

	void reverse(String input) {
		System.out.println("The Reverse String is :");
		char ch;
		for (int index = input.length() - 1; index >= 0; index--) { // j-0,a-1,g-2,d-3,i-4,s-5,h-6
			ch = input.charAt(index);
			System.out.println(ch);
		}
	}

	int getReapeatingChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;

		}
		return count;
	}
	
	
	void getFirstReapeatingChar(String name) {
		for(int index=0;index<=name.length();index++) {
			int count = getReapeatingChar(name,name.charAt(index)); 
			if(count==2) {   /// search the repeating char -- ss bb exp
				System.out.println("Repeating 1st char is:-  "+ name.charAt(index));
				break;
			}
		}
	}
	
	
	void getnonFirstReapeatingChar(String name) {
		for(int index=0;index<=name.length();index++) {
			int count = getReapeatingChar(name,name.charAt(index)); 
			if(count==1) {  
				System.out.println("Non Repeating char is:-  "+ name.charAt(index));
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringAllProgram stringallprogram = new StringAllProgram();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		stringallprogram.reverse(str);
		
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the String to check 1st repeating char ");
		String str1 = sc1.next();
		stringallprogram.getFirstReapeatingChar(str1);

		

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the Non String to check the char ");
		String str2 = sc1.next();
		stringallprogram.getnonFirstReapeatingChar(str2);
	}

}
