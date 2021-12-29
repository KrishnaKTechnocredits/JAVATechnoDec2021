package shital;

import java.util.Scanner;

class A13_PrintAllUniqueCharacters{
	
	void findUniqueChar(String name){
		for(int index=0;index<=name.length();index++){
			char ch=name.charAt(index);
			if(name.indexOf(ch)==name.lastIndexOf(ch)){
				System.out.println("Unique Char is : "+ch);
			}
		}
	}

	public static void main(String[] args){
		A13_PrintAllUniqueCharacters printAllUniqueCharacters=new A13_PrintAllUniqueCharacters();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enater a String :");
		String name=sc.nextLine();
		printAllUniqueCharacters.findUniqueChar(name);
		sc.close();
		
	}
}

