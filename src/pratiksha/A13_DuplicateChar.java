package pratiksha;

import java.util.Scanner;

public class A13_DuplicateChar {

	void duplicateCharacter(String name) {
    	char ch =' ';
    	for(int index=0; index<name.length(); index++) {
    		ch=name.charAt(index);
    		if(name.indexOf(ch)!=name.lastIndexOf(ch)) {
    			System.out.println("duplicate characters are :"+ch);
    		}
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	A13_DuplicateChar duplicatechar = new A13_DuplicateChar();
	System.out.println("Enter Word: ");
	String name = sc.nextLine();
	duplicatechar.duplicateCharacter(name);
	

	}

}
