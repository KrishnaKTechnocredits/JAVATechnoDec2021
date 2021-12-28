package shital;

import java.util.Scanner;

class NonRepeatingCharFromString{
	
	
	int findChar(String name, char ch){
		int count =0;
		for(int index=0;index<name.length();index++){
			if(name.charAt(index)==ch){
				count++;
			}	
		}
		return count;
	}
	
	void findNonRepeatChar(String name){
		int value;
		//System.out.println("Given String is: "+name);
		for(int index=0;index<name.length();index++){
			value=findChar(name,name.charAt(index));
			if(value==1){
				System.out.println("\nFirst NonRepeating Char from given String is: "+name.charAt(index));
				 break;
			}
		}
	}
	
	public static void main(String[] args){
		NonRepeatingCharFromString nonRepeatingCharFromString=new NonRepeatingCharFromString();
		Scanner sc=new Scanner(System.in);
		System.out.println("****Find First Non Repeating char from given String****");
		System.out.println("Enter a String: ");
		String name=sc.nextLine();
		nonRepeatingCharFromString.findNonRepeatChar(name);
		sc.close();
		
	}
}