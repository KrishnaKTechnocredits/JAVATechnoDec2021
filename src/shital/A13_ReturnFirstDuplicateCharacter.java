package shital;

import java.util.Scanner;

class A13_ReturnFirstDuplicateCharacter{

	void findFirstDuplicateChar(String name){
		for(int index=0;index<=name.length();index++){
			char ch=name.charAt(index);
	
				if(name.indexOf(ch)!=name.lastIndexOf(ch)){
					System.out.println("First Duplicate Char is :"+ch);
					break;
				}
		}
	}

	public static void main(String[] args){
		A13_ReturnFirstDuplicateCharacter findFirstDuplicate=new A13_ReturnFirstDuplicateCharacter();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String name=sc.nextLine();
		findFirstDuplicate.findFirstDuplicateChar(name);
		sc.close();
	}
}