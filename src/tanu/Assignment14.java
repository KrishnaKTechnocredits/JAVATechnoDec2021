package tanu;

import java.util.Scanner;

class Assignment14 {



	void compareDuplicateUniqueCharacter(String name) {	
		int uniquecount = 0;
		int duplicount = 0;
		char doupli;
		for (int index = 0; index < name.length(); index++) {
			doupli = name.charAt(index);
			if (name.indexOf(doupli) != name.lastIndexOf(doupli)) {
				duplicount++;
			}
			else
			{
				uniquecount++;
			}

		}
		if (uniquecount >  duplicount) {
			System.out.println("Selenium");
		}
		else {
			System.out.println("Java");
		}
	}
	

	public static void main(String[] arg) {
		Assignment14 assignment = new Assignment14();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String userInput2 = input.next();
		assignment.compareDuplicateUniqueCharacter(userInput2);
        
	}
}