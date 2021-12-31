package shital;

import java.util.Scanner;

class RepeatingCharFromString{
	
	int findChar(String name, char ch){
		int count=0;
		for(int index=0;index<name.length();index++){
			if(name.charAt(index)==ch){
			count++;	
			}
		}
		return count;
	}
	
	void repeatChar(String name){
		int value;
		for(int index=0;index<name.length();index++){
			value=findChar(name,name.charAt(index));
			if(value>1){
			 System.out.println("Repeating char is: "+name.charAt(index));	
			 break;
			}
		}
	}
	
	public static void main(String[] args){
		RepeatingCharFromString repeatingCharFRomString=new RepeatingCharFromString();
		Scanner sc=new Scanner(System.in);
		System.out.println("****Find First Repeating char from given String****");
		System.out.println("\nEnter a String: ");
		String name=sc.nextLine();
		repeatingCharFRomString.repeatChar(name);
		sc.close();
	}
}