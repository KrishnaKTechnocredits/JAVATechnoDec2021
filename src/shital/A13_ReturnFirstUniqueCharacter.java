package shital;

import java.util.Scanner;

class A13_ReturnFirstUniqueCharacter{

	void findFirstUniqueChar(String name){
		for(int index=0;index<=name.length();index++){
			char ch=name.charAt(index);
			if(name.indexOf(ch)==name.lastIndexOf(ch)){
				System.out.println("First Unique Character in a String  is :"+ch);
				break;
			}
		}			
	}
	
	public static void main(String[] args){
		A13_ReturnFirstUniqueCharacter returnUnique=new A13_ReturnFirstUniqueCharacter();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String name=sc.nextLine();
		returnUnique.findFirstUniqueChar(name);
		sc.close();
	}
}