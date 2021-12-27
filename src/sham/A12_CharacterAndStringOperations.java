package sham;

import java.util.Scanner;

public class A12_CharacterAndStringOperations {
	void displayNonRepeatingChar(String input,char ch)
	{ 		
		System.out.println("-------first Method----------");

		int count=0;
		for(int index=0;index<input.length();index++)
		{
			if(input.charAt(index)==ch)
			{
				count++;				
			}
		}
		if(count==1) {
			System.out.println("first non repeating char is: "+ch);
		}
		else 
			System.out.println("we found multiple occurances for provided char: "+ch);
		 
	}
	
	void displayFirstMatchingChar(String name,char ch)
	{
		System.out.println("-------Second Method----------");
		boolean flag= true;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==ch) {
				flag=false;
				break;
			}
			
		}
		
		if(flag==false) {
			System.out.println("first matching char is: "+ch);
		}
	}
	
	
	void reverseString(String name)
	{ String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
		 rev=rev+name.charAt(i);	
		}
		System.out.println("Reverse String is: "+ rev);
	}

	public static void main(String[] args) {
		A12_CharacterAndStringOperations operations= new A12_CharacterAndStringOperations();
		Scanner sc= new Scanner(System.in);
		System.out.println("Insert Inputs as Required for first method");
		System.out.println("Enter a String: ");
		String name=sc.next();
		System.out.println("Enter a character: ");
		char ch=sc.next().charAt(0);
		operations.displayNonRepeatingChar(name,ch);
		System.out.println("Insert Inputs as Required for second method:");
		System.out.println("Enter a String: ");
		String name1=sc.next();
		System.out.println("Enter a character: ");
		char ch1=sc.next().charAt(0);
		operations.displayFirstMatchingChar(name1,ch1);
	
		System.out.println("Enter a String to reverse: ");
	String toRevString=	sc.next();
		operations.reverseString(toRevString);
		sc.close();
		
	}

}
