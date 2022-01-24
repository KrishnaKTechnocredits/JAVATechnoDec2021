package shital;

import java.util.Scanner;

class ReturnReverseString{
	
	String reverseString(String name){
		String str="";
		for(int index=name.length()-1;index>=0;index--)
		str=str+name.charAt(index);
		System.out.println("Reverse string is: "+str);
		return str;
	}
	
	public static void main(String[] args){
		ReturnReverseString returnString=new ReturnReverseString();
		Scanner sc=new Scanner(System.in);
		System.out.println("*******Reverse a given String*******");
		System.out.println("Enter a String: ");
		String name=sc.nextLine();
		returnString.reverseString(name);
		sc.close();
	}
}