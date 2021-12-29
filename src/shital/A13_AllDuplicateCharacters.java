package shital;

import java.util.Scanner;

class PrintAllDuplicateCharacters{
	
	void findDupliacteChar(String name){
		for(int index=0;index<=name.length();index++){
			char ch=name.charAt(index);
			if(index==name.indexOf(ch)){
				if(name.indexOf(ch)!=name.lastIndexOf(ch)){
					System.out.println("Duplicate Character in given string is: "+ch);
					
				}
			}
		}
	}
	
	public static void main(String[] args){
		PrintAllDuplicateCharacters printAllDuplicateCharacters=new PrintAllDuplicateCharacters();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String name=sc.nextLine();
		printAllDuplicateCharacters.findDupliacteChar(name);
		sc.close();
	}

}